package com.gg.finalkeyword;

public /*final*/ /*abstract*/ class Car {
    private /*final*/ String color; // setter does not work

    public Car(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() + " " +
                "color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public final void describe() {
        System.out.println("I'm describing my brilliant awsome car.");
    }
}
