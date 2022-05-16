package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void theTestOfFindingSquaresOfNumbersInTheRangeA() {
        SQRService service = new SQRService();
        int actual = service.numericRoots(200, 300);
        int expected = 3;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void theTestOfFindingSquaresOfNumbersInTheRangeB() {
        SQRService service = new SQRService();
        int actual = service.numericRoots(110, 450);
        int expected = 11;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void theTestOfFindingSquaresOfNumbersInTheRangeC() {
        SQRService service = new SQRService();
        int actual = service.numericRoots(300, 600);
        int expected = 7;
        Assertions.assertEquals(actual, expected);
    }
}
