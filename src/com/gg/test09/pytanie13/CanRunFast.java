package com.gg.test09.pytanie13;

public interface CanRunFast {
    default boolean isFast() {
        return true;
    }
}
