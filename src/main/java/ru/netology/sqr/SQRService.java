package ru.netology.sqr;

public class SQRService {
    public int calculateCountSqr(int start, int finish) {
        int count = 0;
        for (int i = 1; i <= finish; i++) {
            if (i * i >= start && i * i <= finish) {
                count++;
            }
        }
        return count;
    }
}

