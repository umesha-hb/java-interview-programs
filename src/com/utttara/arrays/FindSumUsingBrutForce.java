package com.utttara.arrays;

import java.util.ArrayList;

public class FindSumUsingBrutForce {
	public static void main(String[] args) {
		int target = 15;
		ArrayList result = new ArrayList();
		System.out.println("************");
		int a[] = { 1, 9, 2, 19, 14, 6 };
		for (int i = 0; i < a.length; i++) {
			for(int j=i+1; j<a.length; j++){ 	
				if(a[i] + a[j] == target){ 
					 result.add(i+","+j);  
				} 
			}
		}
		result.stream().forEach(System.out::println);
	}
}
/*
⏱ Complexity

Time Complexity →Nested loops:  O(n2)

Space Complexity → O(n) (only two variables)
 */
