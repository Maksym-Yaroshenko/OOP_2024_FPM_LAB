package com.gildedrose.out.com.gildedrose;

import com.gildedrose.Item;

public class Backstage extends Item {
    public Backstage(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        increaseQualityByOne();
        if (getSellIn() < 6) {
            increaseQualityByOne();
        }
        if (getSellIn() < 11) {
            increaseQualityByOne();
        }
        decreaseSellInByOne();
        if (getSellIn() < 0) {
            setSellIn(0);
        }
    }

}
