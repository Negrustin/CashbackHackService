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
    public void purchaseSumLowerBoundaryBonus(){
        int actual = service.remain(1);
        int expected = 999;

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void purchaseSumUpperBoundaryBonus(){
        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(actual,expected);

    }

    @Test
    public void purchaseSumEqualBonus() {

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void purchaseSumMultiplyBonus() {

        int actual = service.remain(4000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}