package com.gg.pack8;

public class SubClass extends SuperClass {

    @Override
    String defaultMethod() {
        return "SubClass defaultMethod";
    }

    @Override
    protected String protectedMethod() {
        return "SubClass protectedMethod";
    }

    @Override
    public String publicMethod() {
        System.out.println("print something");
        System.out.println(super.publicMethod());
        return "SubClass publicMethod";
    }
}
