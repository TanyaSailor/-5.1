package ru.netology.homeworks.squares.services;

public class SQRService {
    public int calcSqrt(int x, int y) {
        int a = 0;
        int i;

        for (i = 10; i >= 10 && i <= 99; i++) {

            if (i * i >= x && i * i <= y) {
                a = a + 1;
            }
        }
        return a;
    }

}
