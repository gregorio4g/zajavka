package com.gg.test09;

public class QuizExample {
    public QuizExample(byte arg) {
        System.out.print(1);
    }
    public QuizExample(int arg) {
        System.out.print(2);
    }
    public QuizExample(Integer arg) {
        System.out.print(3);
    }
    public QuizExample(Object arg) {
        System.out.print(4);
    }
    public QuizExample(int... args) {
        System.out.print(5);
    }

    public static void main(String[] args) {
        new QuizExample(1L);
        new QuizExample(1);

    }
}
