package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        int num = 1;
        int sum;
        for (int zeile = 0; zeile < table.length; zeile++) {
            for (int spalte = 0; spalte < table[zeile].length; spalte++) {
                sum = (spalte * num) + num;
                table[zeile][spalte] = sum;
            }
            num++;
        } return table;
    }
}
