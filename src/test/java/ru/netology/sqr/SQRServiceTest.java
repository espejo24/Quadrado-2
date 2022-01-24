package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void shouldCountSquares () {
        SQRService service = new SQRService ();
        int count = 0;
        int lowLimit = 100;
        int highLimit = 500;
        int expected = 13;
        int actual = service.countSquares(lowLimit, highLimit);
        assertEquals(expected, actual);
    }



}