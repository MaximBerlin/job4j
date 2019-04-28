package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result;
        boolean booFirstAndSecond = first >= second;
        int intFirstAndSecond = booFirstAndSecond ? first : second;
        boolean booSecondAndThird = intFirstAndSecond >= third;
        result = booSecondAndThird ? intFirstAndSecond : third;
        return result;
    }
}