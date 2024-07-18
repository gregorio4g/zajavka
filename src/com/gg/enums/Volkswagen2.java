package com.gg.enums;

public enum Volkswagen2 implements MyExampleInterface {
    PASSAT("white", 2020),
    GOLF("red", 1020),
    ARTEON("green", 3040),
    TIGUAN("blue", 2021),
    TOUAREG("brown", 1976);

    private String color;

    private int productionYear;

    Volkswagen2(String color, int productionYear) {
        this.color = color;
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Volkswagen{" +
                "color='" + color + '\'' +
                ", productionYear=" + productionYear +
                "} " + super.toString();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public String doSomething() {
        return "Something!" + productionYear;
    }
}
