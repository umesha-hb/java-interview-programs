package com.uttara.string.techchefs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPermutationsProgram
{
	public static void main(String[] args)
	{
	     StringPermutationsProgram permuter = new StringPermutationsProgram();
//	     List<String> perms = permuter.permutations("umesh");
//	     System.out.println(Arrays.toString(perms.toArray()));
//	  
	     List<String> perms1 = permuter.permutations("abca");
	     System.out.println(Arrays.toString(perms1.toArray()));
//	     System.out.println(perms1.size());
	   }

	private List<String> permutations(String inputStr)
	{
		if(inputStr == null) 
		{
			return null;
		}
		List<String> result = new ArrayList<String>();
		if(inputStr.length()<2)
		{
			result.add(inputStr);
			return result;
		}
		 final List<String> permutations = permutations(inputStr.substring(1));
		 for (final String permutation : permutations)
		 {
		        for (int i = 0; i <= permutation.length(); i++)
		        {
		        	String newPermutation = permutation.substring(0, i)+ inputStr.charAt(0) + permutation.substring(i);
		        	result.add(newPermutation);
		        }
		 }
		 return result;
	}
}
