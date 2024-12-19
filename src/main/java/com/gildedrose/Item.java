package com.gildedrose;

public class Item {

    private String name;

    private int sellIn;

    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void decreaseSellInByOne() {
        this.sellIn--;
    }

    public void increaseQualityByOne() {
        if (quality < 50) {
            this.quality++;
        }
    }

    public void decreaseQuality() {
        if (quality > 0) {
            quality--;
        }
    }

    public void updateQuality() {
        decreaseQuality();
        decreaseSellInByOne();
        if (sellIn < 0) {
            decreaseQuality();
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
