package com.gg.enums;

import org.jetbrains.annotations.NotNull;

public enum Volkswagen implements MyExampleInterface {
    PASSAT("white", 2020),
    GOLF("red", 1020),
    ARTEON("green", 3040),
    TIGUAN("blue", 2021),
    TOUAREG("brown", 1976);

    private @NotNull String color;

    private final int productionYear;

    Volkswagen(@NotNull String color, int productionYear) {
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

    public @NotNull String getColor() {
        return color;
    }

    public void setColor(@NotNull String color) {
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
