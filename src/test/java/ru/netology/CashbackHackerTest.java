package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerTest {
    CashbackHacker service = new CashbackHacker();

    @Test
    public void remain() {
        CashbackHacker service = new CashbackHacker();
        assertEquals(100,service.remain(900) );
    }
    @Test
    public void showdCheckRemainIfAmountIsEqualToBoundary() {
        CashbackHacker service = new CashbackHacker();
        assertEquals(0,service.remain(1000));
    }
}