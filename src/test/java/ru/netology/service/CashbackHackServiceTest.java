package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        int amount = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain100() {
        int amount = 100;
        int expected = 900;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain1000() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}