package com.utttara.strings;

import java.util.HashSet;

public class LongestSubstringCount {
    public static void main(String[] args) {
        String input="abcabcbb";
        System.out.println(longestSubStringCount(input));

    }

    private static int longestSubStringCount(String input)
    {
        int maxlength =0;
        int left=0;
        int start=0;
        HashSet<Character> hs = new HashSet<>();
        for (int right = 0; right < input.length(); right++)
        {
            while(hs.contains(input.charAt(right)))
            {
                hs.remove(input.charAt(left));
                left++;
            }
            hs.add(input.charAt(right));
             maxlength = Math.max(maxlength,right-left+1);
        }

        return maxlength;
    }
}
