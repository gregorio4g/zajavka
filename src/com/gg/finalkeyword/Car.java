package com.gg.finalkeyword;

public class Car {
    private String color;

    public Car(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }
}
