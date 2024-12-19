package com.gildedrose.out.com.gildedrose;

import com.gildedrose.Item;

public class Sulfuras extends Item {
    public Sulfuras(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        // Nothing was used here
    }

}
