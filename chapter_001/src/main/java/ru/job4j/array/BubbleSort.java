package ru.job4j.array;

/**
 * Обертка над строкой.
 */
public class BubbleSort {
    boolean result = true;
    public int[] sort(int[] array) {
        for (int out = 0; out < array.length - 1; out++) {
            for (int in = 0; in < array.length - 1 - out; in++) {
                int temp = array[in];
                if (array[in] > array[in + 1]) {
                    array[in] = array[in + 1];
                    array[in + 1] = temp;
                }
            }
        }
        return array;
    }
}