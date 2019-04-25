package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest  {
    /**
     * addition ( + )
     */
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * division ( / )
     */
    @Test
    public void whenDiv2On2Then1()  {
        Calculator calc = new Calculator();
        double result = calc.div(2D, 2D);
        double expected = 1D;
        assertThat(result, is(expected));
    }
    /**
     * subtraction ( - )
     */
    @Test
    public void whenSub2On1Then1() {
        Calculator calc = new Calculator();
        double result = calc.sub(2D, 1D);
        double expected = 1D;
        assertThat(result, is(expected));
    }
    /**
     * multiplication ( * )
     */
    @Test
    public void whenMul2On2Then4() {
        Calculator calc = new Calculator();
        double result = calc.mul(2D, 2D);
        double expected = 4D;
        assertThat(result, is(expected));
    }

}