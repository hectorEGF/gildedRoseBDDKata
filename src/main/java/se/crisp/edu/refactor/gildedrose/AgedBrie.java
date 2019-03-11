package se.crisp.edu.refactor.gildedrose;

public class AgedBrie extends DegradingItem {

    public static final String AGED_BRIE = "Aged Brie";
    public static final int MAX_QUALITY = 50;

    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    public void updateQuality(){
        if (isSellByDateLowerThan(0))
            increaseQualityBy(2);
        else
            increaseQualityBy(1);
        updateSaleDate();
    }

    private void increaseQualityBy(int quality){
        int newQuality = Math.min(MAX_QUALITY, getQuality() + quality);
        setQuality(newQuality);
    }
}
