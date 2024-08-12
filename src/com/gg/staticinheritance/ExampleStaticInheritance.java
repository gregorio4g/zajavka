package com.gg.staticinheritance;

import com.gg.staticinheritance.A.A29;

import static com.gg.staticinheritance.A.A29.CONST;
import static com.gg.staticinheritance.B29.CONST_1;
import static com.gg.staticinheritance.B29.CONST_2;
import static com.gg.staticinheritance.B29.CONST_3;
import static com.gg.staticinheritance.B29.CONST_4;

public class ExampleStaticInheritance {
    public static void main(String[] args) {
        B29 b = new B29();
        B29.printB();
        System.out.println();

        A29 ab = new B29();
        A29.printA();
        System.out.println();

        C29 c = new C29();
        c.print();
        System.out.println();

        A29 ac = new C29();
        ac.printA();
        System.out.println();

        System.out.println(B29.A_CONST);
        System.out.println(CONST);
        System.out.println(B29.CONST);
        System.out.println(CONST_1);
        System.out.println(CONST_2);
        System.out.println(CONST_3);
        System.out.println(CONST_4);
    }
}
