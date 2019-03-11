package se.crisp.edu.refactor.gildedrose;

public class BackstagePassesToATAFKAL80ETCConcert extends DegradingItem{

    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    private static final int MAX_QUALITY = 50;

    public BackstagePassesToATAFKAL80ETCConcert(int sellIn, int quality) {
        super(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT, sellIn, quality);
    }

    public void updateQuality(){
        if (isSellByDateLowerThan(0))
            setQuality(0);
        else if (isSellByDateLowerThan(5))
            increaseQualityBy(3);
        else if (isSellByDateLowerThan(10))
            increaseQualityBy(2);
        else
            increaseQualityBy(1);
        updateSaleDate();
    }

    private void increaseQualityBy(int quality) {
        int newQuality = Math.min(MAX_QUALITY, getQuality() + quality);
        setQuality(newQuality);
    }
}
