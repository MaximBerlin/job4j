package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        for (int index = 0; index != array.length; index++) {
            int backArr = array.length - index - 1;
            if (backArr > index) {
                int temp = array[index];
                array[index] = array[backArr];
                array[backArr] = temp;
            }
        }
        return array;
    }
}