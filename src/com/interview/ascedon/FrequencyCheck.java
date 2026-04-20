package com.interview.ascedon;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCheck {

    public static String checkFrequency(String s) {

        Map<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int value : map.values()) {
            if(value>1)
                return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        System.out.println(checkFrequency("aabbcd")); // NO
        System.out.println(checkFrequency("abc"));    // YES
    }
}