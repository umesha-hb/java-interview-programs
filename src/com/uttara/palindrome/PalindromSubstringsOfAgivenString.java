package com.uttara.palindrome;

public class PalindromSubstringsOfAgivenString {

	public static void main(String[] args) {
		// Custom input string
        String str = "babad";

        System.out.println(
                "No.of palindromic substrings in the given string are "
                + countPalindromicSubstrings(str));
	}


    public static int countPalindromicSubstrings(String s) {
        int n = s.length();
        int count = 0;

        // Generate all substrings
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                String subString = s.substring(start,end+1);
                // Check if s[start..end] is palindrome
                if (isPalindrome(subString)) {
//                if (isPalindrome(s, start, end)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isPalindrome(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return s.equals(reverse);
    }




//  private static boolean isPalindrome(String s, int left, int right) {
//        // Loop to check palindrome
//        while (left < right) {
//            if (s.charAt(left) != s.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }

}
