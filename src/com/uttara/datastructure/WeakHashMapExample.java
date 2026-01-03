package com.uttara.datastructure;

import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {

        WeakHashMap<String, String> map = new WeakHashMap<>();

        String key1 = new String("key1");
        String key2 = new String("key2");

        map.put(key1, "value1");
        map.put(key2, "value2");

        System.out.println("Before GC: " + map);

        key1 = null; // remove strong reference

        System.gc(); // request GC

        System.out.println("After GC: " + map);



    }
}

