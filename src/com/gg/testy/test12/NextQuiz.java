package com.gg.testy.test12;

public class NextQuiz {
    static String value2 = "2";

    static {
        value2 += "5";
    }

    final String value3 = "3";
    String value1 = "1";

    {
        value2 += "8";
    }
}
