package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        boolean arrIn = data[0];
        boolean arrInTwo;
            for (int index = 0; index < data.length; index++) {
                arrInTwo = data[index];
                if (arrIn != arrInTwo) {
                    result = false;
                    break;
                }
            }
        return result;
    }
}