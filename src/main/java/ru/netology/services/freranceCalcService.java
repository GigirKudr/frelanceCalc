package ru.netology.services;

public class freranceCalcService {
    public int calculate(int incom, int expenses, int threshold) {
        int money = 0;
        int count = 0;
        for (int month = 1; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = money - expenses - ((money - expenses) / 3);
            } else {

                money = money + incom - expenses;
            }
        }
        return count;
    }
}
