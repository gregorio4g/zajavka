package com.gg.test10;

public class Mercedes extends Cabriolet {
    public void openRoof() {
        System.out.println("Mercedes is opening roof");
    }

    public static void main(String[] args) {
        Cabriolet reptile = new Mercedes();
        reptile.openRoof();
    }
}
