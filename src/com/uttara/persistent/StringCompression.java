package com.uttara.persistent;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StringCompression {

	public static void main(String[] args) {

		String s = "aaaaabbbabbbccczasaaa";
		int count = 1;
	  char[] ch = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <ch.length ; i++) {
			if(ch[i]==ch[i-1])
			{
				count++;
			}
			else
			{
				sb.append(ch[i-1]);
				sb.append(count);
				count =1;
			}
		}

			sb.append(s.charAt(s.length() - 1));
			sb.append(count);

		System.out.println(sb.toString());
	}

}
