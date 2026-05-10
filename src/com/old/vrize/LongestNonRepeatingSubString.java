package com.old.vrize;

import java.util.HashSet;

/*
Now Let’s Trace
Initial Values
left = 0
maxLength = 0
start = 0
set = {}

Iteration by Iteration Trace
i = 0 → 'a'
Not in set
Add 'a'
Window = "a"
set = {a}
length = 1
maxLength = 1
start = 0

i = 1 → 'b'
Not in set
Add 'b'
Window = "ab"
set = {a, b}
length = 2
maxLength = 2
start = 0

i = 2 → 'c'
Not in set
Add 'c'
Window = "abc"
set = {a, b, c}
length = 3
maxLength = 3
start = 0

i = 3 → 'a' (Duplicate!)
'a' already in set
Enter while loop:
Remove s[left] → remove 'a'
left = 1
Now add 'a'
Window = "bca"
set = {b, c, a}
length = 3
maxLength = 3

i = 4 → 'b' (Duplicate)
Remove s[left] → remove 'b'
left = 2
Add 'b'
Window = "cab"
set = {c, a, b}
length = 3
maxLength = 3

i = 5 → 'c' (Duplicate)
Remove s[left] → remove 'c'
left = 3
Add 'c'
Window = "abc"
set = {a, b, c}
length = 3
maxLength = 3

i = 6 → 'b' (Duplicate)
Remove s[left] → remove 'a'
left = 4

Still duplicate? yes
Remove s[left] → remove 'b'
Add 'b'
Window = "cb"
set = {c, b}
length = 2

i = 7 → 'b' (Duplicate)
Remove s[left] → remove 'c'
left = 6
Still duplicate?
Remove s[left] → remove 'b'
left = 7
Add 'b'
Window = "b"

- `left` → start of window
- `i` → end of window
- Expand window if no duplicate
- Shrink window if duplicate found
- Track max length

# ⏱ Time Complexity
O(n)
Each character:
- Added once
- Removed once
> This uses the Sliding Window technique with a HashSet to track unique characters.
> If duplicate found, we shrink the window from left until duplicate is removed.
> Time complexity is O(n).
 */
public class LongestNonRepeatingSubString {
    public static void main(String args[])
    {
        String s ="abcdabcba";
        System.out.println(longestSubString(s));
        System.out.println(longestSubStringMaxLength(s));
    }

    private static int longestSubStringMaxLength(String s) {
        int maxLength=0;
        int left = 0;

        HashSet<Character> hs = new HashSet();
        for (int right = 0; right <s.length() ; right++) {
            while(hs.contains(s.charAt(right)))
            {
                hs.remove(s.charAt(left));//shrinking
                left++;
            }
            hs.add(s.charAt(right));
           maxLength=Math.max(maxLength,right-left+1);

        }
        return maxLength;
    }


    public static String longestSubString(String s)
    {
        int maxLength=0;
        int start =0;
        int left = 0;

        HashSet<Character> hs = new HashSet();
        for (int right = 0; right <s.length() ; right++) {
            while(hs.contains(s.charAt(right)))
            {
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(right));
            if (right - left + 1 > maxLength) {
                maxLength = right-left+1;
                start = left;
            }
        }
        return s.substring(start,start+maxLength);
    }

}
