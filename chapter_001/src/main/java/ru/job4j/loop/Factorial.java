package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int result = 1;
        if (n != 0) {
            for (int x = 1; x <= n; x++) {
                result = result * x;
            }
        }
        return result;
    }
}