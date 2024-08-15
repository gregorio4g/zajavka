package com.gg.testy.test13.pytanie05_06;

public class CallingClass {
    public void print() throws MyException {
//        throw new MyException();
//        throw new RuntimeException();
        throw new MyNextException();
    }
}
