package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result;
        boolean firstComp = first >= second;
        int intFirstAndSecond = firstComp ? first : second;
        boolean secondComp = intFirstAndSecond >= third;
        result = secondComp ? intFirstAndSecond : third;
        return result;
    }
}