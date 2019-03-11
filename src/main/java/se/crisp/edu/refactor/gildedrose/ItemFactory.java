package se.crisp.edu.refactor.gildedrose;

public class ItemFactory {
    public static DegradingItem newItem(String name, int sellIn, int quality) {
        if  (AgedBrie.AGED_BRIE.equals(name)){
            return new AgedBrie(sellIn, quality);
        }else if (SulfurasHandOfRagnaros.SULFURAS_HAND_OF_RAGNAROS.equals(name)){
            return new SulfurasHandOfRagnaros(sellIn,quality);
        }else if (BackstagePassesToATAFKAL80ETCConcert.BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT.equals(name)){
            return new BackstagePassesToATAFKAL80ETCConcert(sellIn,quality);
        }
        return new DegradingItem(name, sellIn, quality);
    }
}
