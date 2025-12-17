package com.uttara;

import java.util.stream.Stream;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,count=0,num=10, c=0;
		while (count<num)
		{
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
			count++;
		}
	
		Stream.iterate(new int[] { 0, 1 },
				f -> new int[] { f[1], f[0] + f[1] })
		.limit(10)
		.map(f -> f[0])
				.forEach(System.out::println);
	}


}
