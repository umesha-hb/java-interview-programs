package com.utttara.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PushZero {

	public static void main(String[] args) {
		int arr [] = {0,0,0,1,1,0,1,0,1};
		int count = 0;
		for (int i = 0; i < arr.length; i++)
		{
			
			if(arr[i]==0)
			{
				arr[count]=arr[i];
				count = count+1;
			}

		}
		while (count < arr.length)
	        arr[count++] = 1;

		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		List<Integer> collect = Stream.concat(Arrays.stream(arr).boxed().filter(e -> e == 1),
				Arrays.stream(arr).boxed().filter(e -> e == 0)).collect(Collectors.toList());

		System.out.println(collect);
	}

}
