package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemTest {

    @Test
    void testIncreaseQualityByOne() {
        Item item = new Item("Test Item", 10, 20);
        item.increaseQualityByOne();
        assertEquals(21, item.getQuality(), "Quality should increase by 1");
    }

    @Test
    void testDecreaseQuality() {
        Item item = new Item("Test Item", 10, 20);
        item.decreaseQuality();
        assertEquals(19, item.getQuality(), "Quality should decrease by 1");
    }

    @Test
    void testDecreaseSellInByOne() {
        Item item = new Item("Test Item", 10, 20);
        item.decreaseSellInByOne();
        assertEquals(9, item.getSellIn(), "SellIn should decrease by 1");
    }

    @Test
    void testUpdateQuality() {
        Item item = new Item("Test Item", 10, 20);
        item.updateQuality();
        assertEquals(9, item.getSellIn(), "SellIn should decrease by 1 after update");
        assertEquals(19, item.getQuality(), "Quality should decrease by 1 after update");
    }

    @Test
    void testUpdateQualityExpired() {
        Item item = new Item("Expired Item", -1, 10);
        item.updateQuality();
        assertEquals(-2, item.getSellIn(), "SellIn should decrease by 1 after update");
        assertEquals(8, item.getQuality(), "Quality should decrease twice after expiration");
    }
}
