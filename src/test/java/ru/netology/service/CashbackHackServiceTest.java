package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void purchaseSumLessBonus() {

        int actual = service.remain(400);
        int excepted = 600;

        Assert.assertEquals(actual, excepted);
    }

    @Test
    public void purchaseSumEqualBonus() {

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

}
