package com.gg.zad7;

public class QuarterCalculator extends FunctionClass implements Function{
    @Override
    public int calculate(int number) {
        return number / 4;
    }

    @Override
    int calculateC(int number) {
        return number / 4;
    }
}
