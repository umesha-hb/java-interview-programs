package com.uttara.datastructure;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        Map<String, String> map = new IdentityHashMap<>();

        String a = new String("key");
        String b = new String("key");

        map.put(a, "value1");
        map.put(b, "value2");

        System.out.println(map.size()); // 2
    }
}
