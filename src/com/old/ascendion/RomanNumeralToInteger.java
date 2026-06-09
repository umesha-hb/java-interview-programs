package com.old.ascendion;

import java.util.HashMap;
import java.util.Map;

/*
Convert Roman numeral to integer.
Input:"XIV"
Output:14
I=1, V=5, X=10, L=50, C=100, D=500, M=1000

Rotate array to the right by k steps.
Input:[1,2,3,4,5,6,7], k=3
Output:[5,6,7,1,2,3,4]


 */
public class RomanNumeralToInteger {

    public static void main(String args[])
    {
        String s = "X";
        System.out.println(romanToInt("IV")); // Output: 14
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));

            // Check next value (if exists)
            if (i < s.length() - 1) {
                int next = map.get(s.charAt(i + 1));

                if (current < next) {
                    total -= current; // subtract case
                }else{
                    total += current;
                }
//
           }
            else
            {
                total += current; // last character
            }
        }

        return total;
    }

}
