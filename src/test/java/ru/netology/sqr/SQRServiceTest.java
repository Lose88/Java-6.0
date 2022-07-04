package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @Test
    public void testExpectedActual() {
        SQRService service = new SQRService();
        int start = 10;
        int finish = 99;
        int expected = 6;

        int actual = service.CalculateCountSqr(start, finish);
               Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFinish100() {
        SQRService service = new SQRService();
        int start = 10;
        int finish = 100;
        int expected = 7;

        int actual = service.CalculateCountSqr(start, finish);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStart0() {
        SQRService service = new SQRService();
        int start = 0;
        int finish = 99;
        int expected = 9;

        int actual = service.CalculateCountSqr(start, finish);
        Assertions.assertEquals(expected, actual);
    }
}
