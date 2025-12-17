package com.uttara;

import java.util.ArrayList;
import java.util.List;

//[1,2,3,4,22,6,7,8,9,10,11,12,13,16,19]
public class LongestSubArray {

	public static void main(String[] args) {
		int a[]= {1,2,4,5,6,3,9};
		List al = new ArrayList<>();
		int sum =7;//{1,6},{2,5},{4,3}
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i; j < a.length; j++)
			{
				if(a[i]+a[j]==sum)
				{
					al.add(i+","+j);
				}
			}
		}
 System.out.println(al);
	}

}
