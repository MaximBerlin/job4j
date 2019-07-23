package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        boolean first = data[0];
        boolean second;
            for (int index = 0; index < data.length; index++) {
                second = data[index];
                if (first != second) {
                    result = false;
                    break;
                }
            }
        return result;
    }
}