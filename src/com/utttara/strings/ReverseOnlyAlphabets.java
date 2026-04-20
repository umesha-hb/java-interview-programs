package com.utttara.strings;

import java.util.Arrays;

public class ReverseOnlyAlphabets {
    public static void main(String args[]){
        String str="Ab#cdefg@i";
        char[] ch =str.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right)
        {
            // if left is not alphabet, move left pointer
            if(Character.isDigit(ch[left]))
                left++;
             // if right is not alphabet, move right pointer
            else if(Character.isDigit(ch[right]))
                   right--;
            else
            {
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(ch));
    }
}
