package com.gg.test10;

public class YetAnotherQuizClass {
    String value = "one";
    {
        value += "two";
    }
    public YetAnotherQuizClass() {
        value += "three";
    }
    {
        value += "four";
    }

    public YetAnotherQuizClass(String value) {
        value += value;
    }

    public static void main(String[] args) {
        YetAnotherQuizClass quiz = new YetAnotherQuizClass();
        quiz = new YetAnotherQuizClass("five");
        System.out.println(quiz.value);
    }
}
