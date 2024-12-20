package com.gildedrose;

import com.gildedrose.out.com.gildedrose.Backstage;
import com.gildedrose.out.com.gildedrose.Sulfuras;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpecializedItemsTest {

    @Test
    void testBackstageUpdateQualityBeforeConcert() {
        Backstage backstage = new Backstage(15, 20);
        backstage.updateQuality();
        assertEquals(21, backstage.getQuality(), "Quality should increase by 1");
    }

    @Test
    void testBackstageUpdateQualityCloseToConcert() {
        Backstage backstage = new Backstage(10, 20);
        backstage.updateQuality();
        assertEquals(22, backstage.getQuality(), "Quality should increase by 2 when sellIn <= 10");
    }

    @Test
    void testBackstageUpdateQualityVeryCloseToConcert() {
        Backstage backstage = new Backstage(5, 20);
        backstage.updateQuality();
        assertEquals(23, backstage.getQuality(), "Quality should increase by 3 when sellIn <= 5");
    }

    @Test
    void testSulfurasUpdateQuality() {
        Sulfuras sulfuras = new Sulfuras(0, 80);
        sulfuras.updateQuality();
        assertEquals(80, sulfuras.getQuality(), "Sulfuras quality should not change");
        assertEquals(0, sulfuras.getSellIn(), "Sulfuras sellIn should not change");
    }
}
