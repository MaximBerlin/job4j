package ru.job4j.array;

public class AddSortedArray {

    public static int[] twoArraysOnOne(int[] a, int[] b) {
        int[] together = new int[a.length + b.length];
         int first = 0;
         int second = 0;
        for (int i = 0; i < together.length; i++) {
            if (first < a.length && second < b.length) {
                if (a[first] > b[second]) {
                    together[i] = b[second];
                    second++;
                }
                else {
                    together[i] = a[first];
                    first++;
                }
            }
            else if (second < b.length) {
                together[i] = b[second];
                second++;
            }
            else {
                together[i] = a[first];
                first++;
            }
        }
        return together;
    }
}