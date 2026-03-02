package com.utttara.strings;

import java.util.HashSet;

public class LongestSubstringPrint {
    public static void main(String args[]){
      String input="abcbcbb";
        System.out.println(longestSubstringBrute(input));
    }
    /*
    maxLength = 0
left = 0
start = 0
set = {}

➤ right = 0
Character = 'a'
set does NOT contain 'a'
Add 'a'
     */
    public static String longestSubstringBrute(String s) {
        int maxLength = 0;
        int left = 0;
        int start = 0;
        HashSet<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            if (right - left + 1 > maxLength) {
              maxLength = right - left + 1;
                start = left;
            }
        }
        System.out.println(maxLength);
        return s.substring(start, start + maxLength);
    }
}
