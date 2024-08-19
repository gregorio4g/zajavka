package com.gg.collections;

import java.util.HashSet;
import java.util.Set;

public final class ImmutableVsCollection {
    private final Set<String> someSet;

    public ImmutableVsCollection(String someElement1, String someElement2) {
        Set<String> objects = new HashSet<>();
        objects.add(someElement1);
        objects.add(someElement2);
        this.someSet = objects;
    }

    public Set<String> getSomeSet() {
        return new HashSet<>(someSet);
    }

    public static void main(String[] args) {
        ImmutableVsCollection obj = new ImmutableVsCollection("element1", "element2");
        System.out.println(obj.getSomeSet());
        obj.getSomeSet().add("element3");
        System.out.println(obj.getSomeSet());
    }
}
