package com.gg.passbyvaluevsreference;

public class PrimitivesVsReferences {
    public static void main(String[] args) {
        Cat cat = new Cat("Andrzej");
        System.out.println("cat1 = " + cat);
        // Stack: cat
        // Heap: new Cat("Andrzej")
        passByReferenceOrPassByValue(cat);
        System.out.println("cat4 = " + cat);
        // Stack: anotherReferenceToCat
        // Heap: new Cat("Rafał")

        int i = 10;
        System.out.println("i1 = " + i);
        passByReferenceOrPassByValue(i);
        System.out.println("i4 = " + i);
    }

    private static void passByReferenceOrPassByValue(Cat cat) {
        System.out.println("-> cat2 = " + cat);
        cat = new Cat("Rafał");
        System.out.println("-> cat3 = " + cat);
    }
    private static void passByReferenceOrPassByValue(int i) {
        System.out.println("-> i2 = " + i);
        i = 20;
        System.out.println("-> i3 = " + i);
    }
}
