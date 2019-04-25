package ru.job4j.calculate;

/**
 * Calculate.
 *
 * @author Skakun Maxim (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Calculate {
    /**
     * add.
     * double
     */

    public double add(double first, double second) {
        double summeAdd = first + second;
        return summeAdd;
    }

    public double substract(double first, double second) {
        double summeSub = first - second;
        return summeSub;
    }

    public double div(double first,double second ){
        double summeDiv = first / second;
        return summeDiv;
    }

    public double multiple(double first, double second){
        double summeMul = first * second;
        return summeMul;
    }
}
