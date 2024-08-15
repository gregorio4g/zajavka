package com.gg.testy.test12;

public class Test12 {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println("p.s = " + p.s);

        Child c = new Child();
        System.out.println("c.s = " + c.s);
        
        Parent pc = new Child();
        System.out.println("pc.s = " + pc.s);
        System.out.println("pc.methodC() = " + pc.methodC());
    }
}
