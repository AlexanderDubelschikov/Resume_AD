package ru.netology.service;

public class CustomsService {

    static final int DUTY_RATE = 100;

    public static int calculateCustoms(int price, int weight) {
        int result = price / 100 + weight * DUTY_RATE;
        return result;
    }
}
