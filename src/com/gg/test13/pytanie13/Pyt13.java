package com.gg.test13.pytanie13;

public class Pyt13 {
    public static void main(String[] args) {
        quizMethod();
    }

    private static void quizMethod() {
        String a = null;
        try {
            a.toLowerCase();
        } catch (RuntimeException e) {
            System.out.println(0);
//        } catch (NullPointerException e) { // odkomentować trzeba
//            System.out.println(1);
        } finally {
            System.out.println(2);
        }
    }
}
