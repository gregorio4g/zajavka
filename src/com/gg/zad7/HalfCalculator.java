package com.gg.zad7;

public class HalfCalculator extends FunctionClass implements Function{
    @Override
    public int calculate(int number) {
        return number / 2;
    }

    @Override
    int calculateC(int number) {
        return number / 2;
    }
}
