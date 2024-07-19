package com.gg.test11;

public enum Planet {
//    MERCURY,
//    VENUS,
    EARTH {
        public boolean isInhabited() {
            return true;
        }
    };
//    MARS,
//    JUPITER,
//    SATURN,
//    URANUS,
//    NEPTUNE;

    public abstract boolean isInhabited();
}
