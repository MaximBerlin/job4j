package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
            for (int indexA = 0; indexA < array.length / 2; indexA++) {
                int backArr = array.length - indexA - 1;
                int temp = array[indexA];
                array[indexA] = array[backArr];
                array[backArr] = temp;
            }
        return array;
    }
}