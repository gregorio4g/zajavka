package com.gg.staticinheritance;

import com.gg.staticinheritance.A.A29;

public class B29 extends A29 {
    public static final String CONST = "B_CONST";
    public static final String CONST_1 = "B_CONST";
    public static final String CONST_2 = "B_CONST";
    public static final String CONST_3 = "B_CONST";
    public static final String CONST_4 = "B_CONST";

    public static void printB() {
        System.out.println("Inside class B.");
        printA();
    }
}
