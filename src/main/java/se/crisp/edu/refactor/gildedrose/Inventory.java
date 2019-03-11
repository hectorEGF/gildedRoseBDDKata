package se.crisp.edu.refactor.gildedrose;

import java.util.ArrayList;

public class Inventory {

    private final ArrayList<DegradingItem> items;

    public Inventory() {
        items = new ArrayList<>();
        items.add(ItemFactory.newItem("+5 Dexterity Vest", 10, 20));
        items.add(ItemFactory.newItem("Aged Brie", 2, 0));
        items.add(ItemFactory.newItem("Elixir of the Mongoose", 5, 7));
        items.add(ItemFactory.newItem("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(ItemFactory.newItem("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(ItemFactory.newItem("Conjured Mana Cake", 3, 6));
    }

    ArrayList<DegradingItem> getItems() {
        return items;
    }

    public void addItem(DegradingItem item) {
        items.add(item);
    }
}
