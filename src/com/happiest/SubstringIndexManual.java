package com.happiest;

public class SubstringIndexManual {
    public static void main(String[] args) {
        String str = "i am an engineer";
        String sub1 = "engine";
        String sub2 = "neer";
      //  System.out.println(str.indexOf("engine"));
        System.out.println(findSubstring(str, sub1)); // 8
        System.out.println(findSubstring(str, sub2)); // 12
    }


    public static int findSubstring(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        // Loop through text
        for (int i = 0; i <= n - m; i++) {

            int j;

            // Compare characters
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            // If full match found
            if (j == m) {
                return i;
            }
        }

        return -1;
    }
}
