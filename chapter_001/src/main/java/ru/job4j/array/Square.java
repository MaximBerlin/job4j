package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int value = 1;
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int start = 0; start != rst.length; start++) {
            rst [start] = value * value;
            value++;
        }
        return rst;
    }
}