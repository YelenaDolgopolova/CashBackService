package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void  shouldCalculate() {

        int actual = service.remain(800);
        int expected = 200;

        assertEquals(200, actual);
    }

    @Test
    public void shouldCalculateFall() {
        // Ошибка
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual,expected);
    }
}
