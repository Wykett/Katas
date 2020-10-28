package com.wykett.katas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnluckyDayKataTest {
	@Test
    public void testSomething() {
        assertEquals(3, UnluckyDayKata.unluckyDays(2015));
        assertEquals(1, UnluckyDayKata.unluckyDays(1986));
    }
}
