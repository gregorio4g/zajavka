package com.gg.testy.test10.pytanie12;

public abstract class BigCat {
    public abstract void run(int i);

    public static void main(String[] args) {
        BigCat bigCat = new Lion();
        bigCat.run(100);
    }
}
