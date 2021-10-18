package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerTest {
    CashbackHacker service = new CashbackHacker();

    @Test
    public void testRemain() {
        assertEquals(service.remain(900),100);
    }
    @Test
    public void shouldCheckRemainIfAmountEqualToBoundary() {
        assertEquals(service.remain(1000),0);
    }


}