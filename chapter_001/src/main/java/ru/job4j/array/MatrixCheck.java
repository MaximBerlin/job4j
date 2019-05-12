package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
            for (int spalte = 0; spalte < data.length; spalte++) {
                    boolean tempA = data[spalte][spalte];
                    boolean tempA1 = data[data.length - 1 - spalte][data.length - 1 - spalte];
                    boolean tempB = data[spalte][data.length - 1 - spalte];
                    boolean tempB1 = data[data.length - 1 - spalte][spalte];
                    if (tempA == tempA1 && tempB == tempB1) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                    if (tempA != tempA1){
                        result = false;
                        break;
                    }
       }
        return result;
    }
}