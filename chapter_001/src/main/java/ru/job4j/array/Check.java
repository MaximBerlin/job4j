package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        boolean arrIn;
        boolean arrInTwo;
            for (int index = 0; index < data.length / 2; index++) {
                arrIn = data[index];
                arrInTwo = data[index + 1];
                if (arrIn == arrInTwo) {
                    result = true;
                } else {
                    result = false;
                }
            }
        return result;
    }
}