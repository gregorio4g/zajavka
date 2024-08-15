package com.gg.testy.test10.pytanie15;

public class Spider extends Animal {
    public void printName(boolean input) {
        System.out.print("Spider");
    }

    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.printName("name");
        spider.printName(true);
    }
}