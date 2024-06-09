package com.gg.passbyvaluevsreference;

public class Cat {
    final String name;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public Cat(String name) {
        this.name = name;
    }
}
