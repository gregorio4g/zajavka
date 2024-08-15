package com.gg.testy.test09.pytanie13;

public interface CanRunFast {
    default boolean isFast() {
        return true;
    }
}
