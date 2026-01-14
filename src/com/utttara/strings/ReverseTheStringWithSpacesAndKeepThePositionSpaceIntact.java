package com.utttara.strings;

import java.util.Arrays;

public class ReverseTheStringWithSpacesAndKeepThePositionSpaceIntact {
    public static void main(String args[]){
        String str="I am here";
        char[] ch = str.toCharArray();
        int left=0;
        int right =ch.length-1;
        for (int i = 0; i < ch.length ; i++) {

            while(left<right)
            {
                if(ch[left]==' ')
                {
                    left++;
                }
                else if(ch[right]==' ')
                {
                    right--;
                }
                else {
                    char temp = ch[left];
                    ch[left]=ch[right];
                    ch[right]=temp;
                    left++;
                    right--;
                }
            }
        }
        System.out.println(new String(ch));
    }
}
