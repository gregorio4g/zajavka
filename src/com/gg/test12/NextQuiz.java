package com.gg.test12;

public class NextQuiz {
    String value1 = "1";
    static String value2 = "2";
    final String value3 = "3";
    static {
        value2 += "5";
    }
    {
        value2 += "8";
    }
}
