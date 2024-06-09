package com.gg.test09.pytanie15;

interface CanSwim {
    default boolean canSwim() {
        return false;
    }
}
