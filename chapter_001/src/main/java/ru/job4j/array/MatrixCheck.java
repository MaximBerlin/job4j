package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
            for (int row = 0; row < data.length; row++) {
                    boolean first = data[row][row];
                    boolean second = data[data.length - 1 - row][data.length - 1 - row];
                    boolean third = data[row][data.length - 1 - row];
                    boolean fourth = data[data.length - 1 - row][row];
                    if (first != second || third != fourth) {
                        result = false;
                        break;
                    }
       }
        return result;
    }
}