package ru.job4j.array;

public class AddSortedArray {

    public static int[] twoArraysOnOne(int[] a, int[] b) {
        int[] together = new int[a.length + b.length];
        int first = 0;
        int second = 0;
        int counter = 0;
        while (counter < a.length && counter < b.length) {
            if (a[first] < b[second]) {
                together[counter] = a[first];
                first++;
            } else {
                together[counter] = b[second];
                second++;
            }
                counter++;
        }
        while (second < b.length) {
            together[counter] = b[second];
            second++;
            counter++;
        }
        while (first < a.length) {
            together[counter] = a[first];
            first++;
            counter++;
        }
            return together;
    }
}