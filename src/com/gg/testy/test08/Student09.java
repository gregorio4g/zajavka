package com.gg.testy.test08;

public class Student09 {
    public int id;
    public String name;

    @Override
    public boolean equals(Object e) {
        return id == ((Student09) e).id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
