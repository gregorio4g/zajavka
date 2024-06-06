package com.gg.test08;

public class Employee10 {
    private int id;
    private String name;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Employee10)) {
            return false;
        }
        Employee10 other = (Employee10) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
