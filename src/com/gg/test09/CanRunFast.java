package com.gg.test09;

public interface CanRunFast {
    default boolean isFast() {
        return true;
    }
}
