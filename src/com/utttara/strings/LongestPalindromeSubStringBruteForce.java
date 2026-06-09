package com.utttara.strings;

public class LongestPalindromeSubStringBruteForce {
    public static String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s, i, j))
                {
                    if(j-i+1 > result.length())
                    result = s.substring(i, j + 1);;
                }
            }
        }
        return result;
    }
    private static boolean isPalindrome(String substring, int left, int right) {
        while (left < right) {
            if (substring.charAt(left) != substring.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args) {

        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}