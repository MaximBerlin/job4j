package ru.job4j.array;

public class AddSortedArray {

    public static int[] twoArraysOnOne(int a[], int b[]) {
        int together[] = new int[a.length + b.length];
        int indexOne = 0;
        int indexTwo = 0;
        int counter = 0;

        while(counter < a.length && counter < b.length) {
            if (a[indexOne] < b[indexTwo]) {
                together[counter] = a[indexOne];
                indexOne++;
            } else {
                together[counter] = b[indexTwo];
                indexTwo++;
            } counter++;
        }
        while(indexTwo < b.length){
            together[counter] = b[indexTwo];
            indexTwo++;
            counter++;
        }
        while(indexOne < a.length) {
            together[counter] = a[indexOne];
            indexOne++;
            counter++;
        }
            return together;
    }
}