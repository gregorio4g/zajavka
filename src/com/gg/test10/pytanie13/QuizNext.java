package com.gg.test10.pytanie13;

public class QuizNext {
    public static void main(String[] args) {
        QuizNext quizNext = new QuizNext();
        quizNext = null;
        System.gc();
    }

    public void finalize() {
        System.out.println("Calling finalize");
    }
}
