package ru.job4j.array;

/**
 * Обертка над строкой.
 */
public class BubbleSort {
    boolean result = true;
    public int[] sort(int[] array) {
        for(int index = 0;index < array.length - 1 ;index++){
            for(int a = 0;a < array.length - 1;a++){
                int temp = array[a];
                if(array[a] > array[a + 1]){
                    array[a] = array[a + 1];
                    array[a + 1] = temp;
                }
            }
        }
        return array;
    }
}