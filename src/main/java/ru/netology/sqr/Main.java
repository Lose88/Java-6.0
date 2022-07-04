package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int start = 10;
        int finish = 99;
        int count = service.calculateCountSqr(start, finish);
        System.out.println("Количество квадратных корней в заданном диапозоне: " + count);
    }
}