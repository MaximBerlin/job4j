package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        int num = 1;
        int sum;
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++) {
                sum = (column * num) + num;
                table[row][column] = sum;
            }
            num++;
        } return table;
    }
}
