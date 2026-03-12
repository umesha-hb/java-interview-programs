package com.utttara.strings;

public class LongestPalindromeBruteForce {

    public static String longestPalindrome(String s) {

        String longest = "";

        for (int start = 0; start < s.length();start++) {

            for (int end = start; end < s.length(); end++) {

                String substring = s.substring(start, end + 1);

                if (isPalindrome(substring) && substring.length() > longest.length()) {
                    longest = substring;
                }
            }
        }

        return longest;
    }

    private static boolean isPalindrome(String substring)
    {
        String reversed = new StringBuilder(substring).reverse().toString();
        return reversed.equals(substring)?true:false;
    }

    public static void main(String[] args) {

        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}