package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
            for (int in = 0; in < array.length / 2; in++) {
                int second = array.length - in - 1;
                int first = array[in];
                array[in] = array[second];
                array[second] = first;
            }
        return array;
    }
}