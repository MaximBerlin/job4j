package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AddSortedArrayTest {
    @Test
    public void summArrayLangth() {
        // тест если первый чортированный массив имеет длину 3, от 0 до 2
        // а проторой отсортированный массив имеет длину 4, от 3 до 6
        //  то и длинна их общего массива должна быть 7, от 0 до 6
        AddSortedArray addSortedArray = new AddSortedArray();
        int[] inputA = {0, 1, 2};
        int[] inputB = {3, 4, 5, 6};
        int[] result = addSortedArray.twoArraysOnOne(inputA, inputB);
        int[] expect = new int[] {0, 1, 2, 3, 4, 5, 6};
        assertThat(result, is(expect));
    }
    @Test
    public void summArraysFerstArrayLonger() {
        AddSortedArray addSortedArray = new AddSortedArray();
        int[] inputA = {3, 4, 5, 6};
        int[] inputB = {0, 1, 2};
        int[] result = addSortedArray.twoArraysOnOne(inputA, inputB);
        int[] expect = new int[] {0, 1, 2, 3, 4, 5, 6};
        assertThat(result, is(expect));
    }
    @Test
    public void sortArray() {
        AddSortedArray addSortedArray = new AddSortedArray();
        int[] inputA = {1, 3};
        int[] inputB = {2, 4};
        int[] result = addSortedArray.twoArraysOnOne(inputA, inputB);
        int[] expect = new int[] {1, 2, 3, 4};
    }
}