package ru.netology.sqr;

public class SQRService {
    public int countSquares(
            int lowLimit,
            int highLimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowLimit & i * i <= highLimit)
                count = count + 1;
        }
        return count;
    }
}
