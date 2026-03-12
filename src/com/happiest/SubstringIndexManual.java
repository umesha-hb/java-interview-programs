package com.happiest;

public class SubstringIndexManual {
    public static void main(String[] args) {
        String str = "i am an engineer";
        String sub1 = "engine";
        String sub2 = "neer";
      //  System.out.println(str.indexOf("engine"));
        System.out.println(findSubstringIndex(str, sub1)); // 8
        System.out.println(findSubstringIndex(str, sub2)); // 12
    }

    public static int findSubstringIndex(String str, String sub) {
        int strLen = str.length();
        int subLen = sub.length();
         // Loop through each possible starting index
        for (int i = 0; i <= strLen - subLen; i++) {
            boolean match = true;
            // Check each character in substring
            for (int j = 0; j < subLen; j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return i; // Found the starting index
            }
        }
        return -1; // Substring not found
    }
}
