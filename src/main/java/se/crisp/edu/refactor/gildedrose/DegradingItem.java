package se.crisp.edu.refactor.gildedrose;

public class DegradingItem extends Item{

    public static final int MIN_QUALITY = 0;

    public DegradingItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        if (isSellByDateLowerThan(0)){
            degradeQualityBy(2);
        }else{
            degradeQualityBy(1);
        }
        updateSaleDate();
    }

    protected void updateSaleDate() {
        setSellIn(getSellIn()-1);
    }

    protected boolean isSellByDateLowerThan(int day) {
        return getSellIn() <= day;
    }

    private void degradeQualityBy(int quantity) {
        int newQuality = Math.max(MIN_QUALITY,getQuality() - quantity);
        setQuality(newQuality);
    }
}
