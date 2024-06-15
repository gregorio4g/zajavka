package com.gg.finalkeyword;

public final class ImmutableVan {
    private final boolean roofOpened;
    private final String color;

    public ImmutableVan(boolean roofOpened, String color) {
        this.roofOpened = roofOpened;
        this.color = color;
    }

    public boolean isRoofOpened() {
        return roofOpened;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ImmutableVan{" + super.toString() + " " +
                "roofOpened=" + roofOpened +
                ", color='" + color + '\'' +
                '}';
    }

    public ImmutableVan closeTheRoof() {
        return new ImmutableVan(false, this.color);
    }
}
