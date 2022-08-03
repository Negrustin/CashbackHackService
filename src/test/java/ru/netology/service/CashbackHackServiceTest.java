package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();
    @Test
    public void purchaseSumLowerBoundaryBonus(){

        int expected = 999;
        int actual = service.remain(1);

        assertEquals(expected,actual);
    }

    @Test
    public void purchaseSumUpperBoundaryBonus(){

        int expected = 1;
        int actual = service.remain(999);

        assertEquals(expected,actual);
    }

    @Test
    public void purchaseSumLessBonus() {
        assertEquals(600,
        service.remain(400));

    }


    @Test
    public void purchaseSumEqualBonus() {
        assertEquals(0,
        service.remain(1000));
    }

    @Test
    public void purchaseSumMultipleBonus(){
        assertEquals(0,
        service.remain(2000));
    }

}



