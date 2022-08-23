package ru.netology.homeworks.squares.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {
    @Test
    public void ShouldCalcAmountSqrt() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqrt(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCalculateAmountSqrtUnderLimit() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqrt(0, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCalculateAmountSqrtOverLimit() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calcSqrt(9801, 10000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCalculateAtZero() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqrt(0, 0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCalculateAtNegativeValues() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqrt(-200, -100);

        Assertions.assertEquals(expected, actual);
    }
}

