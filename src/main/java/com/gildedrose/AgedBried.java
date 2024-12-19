package com.gildedrose;

public class AgedBried extends Item {
    public AgedBried(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        increaseQualityByOne();
        decreaseSellInByOne();
        if (getSellIn() < 0) {
            increaseQualityByOne();
        }
    }
}
