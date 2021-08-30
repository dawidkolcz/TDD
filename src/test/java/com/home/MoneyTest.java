package com.home;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    @Test
    void testMultiplication(){
        Dollar five = new Dollar(5);
        Dollar produce = five.times(2);
        assertEquals(10, produce.amount);
        produce = five.times(3);
        assertEquals(15, produce.amount);
    }
    @Test
    void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
