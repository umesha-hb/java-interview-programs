package com.uttara.duplicatcharcterinarray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheDuplicateCharacterInArray {

	public static void main(String[] args)
	{
		
		String s = "abc123";
		String s1 = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if(Character.isDigit(ch[i]))
			{
				s1=s1+ch[i];
			}
		}
      System.out.println(s1);
	}
  List<Integer> l1 = Arrays.asList(1,2,3,4,5);
  List<Integer> l2 = Arrays.asList(5,6,7,8);
}
