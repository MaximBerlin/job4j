package ru.job4j.condition;

public class Max {
    public int max(int left, int right) {
        boolean comparison = left > right;
        int result = comparison ? left : right;
        return result;
    }
}