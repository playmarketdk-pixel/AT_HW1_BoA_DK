package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    void shouldReturn100IfAmount900() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(900);
        Assertions.assertEquals(100, result);
    }

    @Test
    void shouldReturn0IfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1000);
        Assertions.assertEquals(0, result); // этот тест упадёт!
    }
}