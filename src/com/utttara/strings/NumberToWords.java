package com.utttara.strings;

import java.util.HashMap;
import java.util.Map;

public class NumberToWords {
    private static final Map<Integer, String> map = new HashMap<>();
    static
    {
        map.put(0, "Zero");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");
        map.put(11, "Eleven");
        map.put(12, "Twelve");
        map.put(13, "Thirteen");
        map.put(14, "Fourteen");
        map.put(15, "Fifteen");
        map.put(16, "Sixteen");
        map.put(17, "Seventeen");
        map.put(18, "Eighteen");
        map.put(19, "Nineteen");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");
        map.put(50, "Fifty");
        map.put(60, "Sixty");
        map.put(70, "Seventy");
        map.put(80, "Eighty");
        map.put(90, "Ninety");
    }
    public static String numberToWords(int num) {

        if (num == 0) return map.get(0);
        return helper(num).trim();
    }

    private static String helper(int num) {
        String result = "";

        // Step 1: Handle billions
        if (num >= 1_000_000_000) {
            int billions = num / 1_000_000_000;
            result += helper(billions) + " Billion ";
            num = num % 1_000_000_000;
        }
        // Step 2: Handle millions
        if (num >= 1_000_000) {
            int millions = num / 1_000_000;
            result += helper(millions) + " Million ";
            num = num % 1_000_000;
        }
        // Step 3: Handle thousands
        if (num >= 1000) {
            int thousands = num / 1000;
            result += helper(thousands) + " Thousand ";
            num = num % 1000;
        }
        // Step 4: Handle hundreds
        if (num >= 100) {
            int hundreds = num / 100;
            result += helper(hundreds) + " Hundred ";
            num = num % 100;
        }
        // Step 5: Handle tens (20–99)
        if (num >= 20) {
            int tens = (num / 10) * 10;
            result += map.get(tens) + " ";
            num = num % 10;
        }
        // Step 6: Handle numbers less than 20
        if (num > 0 && num < 20) {
            result += map.get(num) + " ";
        }

        return result;
    }

    public static void main(String[] args) {
      System.out.println(numberToWords(199999));
//        System.out.println(numberToWords(123));
//     System.out.println(numberToWords(10245));
//        System.out.println(numberToWords(1110245));
//      System.out.println(numberToWords(2147483647));
    }
}
