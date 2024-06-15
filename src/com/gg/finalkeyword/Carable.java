package com.gg.finalkeyword;

public /*final*/ interface Carable {
    void doSomethingWithCaar();
    default /*final*/ void doSomethingElse() {
        System.out.println("Soemthing else.");
    }
}
