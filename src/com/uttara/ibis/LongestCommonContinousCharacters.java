package com.uttara.ibis;

import java.util.Arrays;

public class LongestCommonContinousCharacters 
{
	 public static void main(String args[])
	    {
	        String arr[] = { "gracefully", "graceful",
	                        "disgraceful","grace" };
	        int n = arr.length;
	        
	        // Take first word from array as reference
	        String s = arr[0];
	        int len = s.length();
	 
	        String res = "";
	 
	        for (int i = 0; i < len; i++) 
	        {
	            for (int j = i + 1; j <= len; j++)
	            {

	                String stem = s.substring(i, j);
	                int k = 1;
	                for (k = 1; k < n; k++) 
	                {
	                    if (!arr[k].contains(stem))
	                        break;
	                }
	 
	                if (k == n && res.length() < stem.length())
	                    res = stem;
	            }
	        }
	        System.out.println(res);
//	      System.out.println(Math.min(Double.MIN_VALUE, 0.0d)); 
	 
	    }
	 

}
