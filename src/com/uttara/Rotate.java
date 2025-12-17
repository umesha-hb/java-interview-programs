package com.uttara;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Input: ar[] = 1,2,3,4,5,6,7,8,9,N=9, d=2
//Output: 345678912
public class Rotate {

	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5,6,7,8,9};
		int n = ar.length;
		int d = 6;
		int count=0;
		//rotate(ar,n,d);
		int[] result=new int[ar.length];
		int i=0;
		for ( i = d; i < ar.length; i++) {
			result[count++]=ar[i];
			
		}
	
		for ( i = 0; i < d; i++) {
			result[count++]=ar[i];
			
		}
		System.out.println(Arrays.toString(result));
		
	}

private static void rotate(int[] ar, int n, int d) 
{
	List<Integer> ll = new ArrayList<>();
	int i=0;
	 for (i = d; i < ar.length; i++)
	 {
		ll.add(ar[i]);
	 }
	 
	 for (i = 0; i < d; i++)
	 {
		ll.add(ar[i]);
	 }

	System.out.println(ll);
}

}
