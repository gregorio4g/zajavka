package com.gg.testy.test11;

public enum Planet {
//    MECURY,
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
