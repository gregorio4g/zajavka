package com.gg.test9;

public interface CanRunFast {
    default boolean isFast() {
        return true;
    }
}
