package se.crisp.edu.refactor.gildedrose;

import java.util.List;


public class GildedRose {

    private Inventory inventory = new Inventory();

    public static void main(String[] args) {
        new GildedRose();
    }

    public GildedRose() {
        System.out.println("OMGHAI!");

        updateQuality();
    }

    public GildedRose(Inventory inventory) {
        this.inventory = inventory;
    }

    public void updateQuality() {
        List<Item> items = inventory.getItems();

        for (Item item : items) {
            int qualityModifier = getQualityModifier(item);
            decreaseQualityAndSellIn(item, qualityModifier);
        }
    }

    private void decreaseQualityAndSellIn(Item item, int qualityModifier) {
        int finalQuality = item.getQuality() + qualityModifier;
        if (finalQuality >= 0 && finalQuality <= 50)
            item.setQuality(finalQuality);

        if (!item.getName().equals("Sulfuras, Hand of Ragnaros"))
            item.setSellIn(item.getSellIn() -1);
    }

    private int getQualityModifier(Item item) {
        int qualityModifier;

        if ((item.getSellIn() <= 5 && item.getName().equals("Backstage passes to a TAFKAL80ETC concert"))){
            qualityModifier = -3;
        }else if (item.getSellIn() <= 0 || (item.getSellIn() <= 10 && item.getName().equals("Backstage passes to a TAFKAL80ETC concert"))) {
            qualityModifier = -2;
        }else
            qualityModifier = -1;

        if (item.getSellIn() <= 0 && item.getName().equals("Backstage passes to a TAFKAL80ETC concert"))
            qualityModifier = item.getQuality();

        if (item.getName().equals("Aged Brie") || item.getName().equals("Backstage passes to a TAFKAL80ETC concert"))
            qualityModifier *= -1;
        return qualityModifier;
    }

}