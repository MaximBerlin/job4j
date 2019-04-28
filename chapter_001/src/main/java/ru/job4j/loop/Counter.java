package ru.job4j.loop;

public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        int a = 0;
        for(; start <= finish; finish++){
            if(start % 2 == 0){
                sum = sum + start;
                a++;
            }
            if(a == 4){
                break;
            }
        }
        return sum;
    }
}