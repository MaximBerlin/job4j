package ru.job4j.loop;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        Factorial check = new Factorial();
        int result = check.calc(5);
        assertThat(result, Matchers.is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        Factorial check = new Factorial();
        int result = check.calc(0);
        assertThat(result, Matchers.is(1));
    }
}

