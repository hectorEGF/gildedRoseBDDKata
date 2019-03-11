package se.crisp.edu.refactor.gildedrose;

public class GildedRose {

    private Inventory inventory;

    public GildedRose(Inventory inventory) {
        this.inventory = inventory;
    }

    public void updateQuality() {
        for (DegradingItem item: inventory.getItems()) {
            item.updateQuality();
        }
    }

}