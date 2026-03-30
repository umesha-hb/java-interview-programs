package com.uttara.java8;

import java.util.stream.Stream;

public class FibonacciJava8  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;

Stream.iterate(new int[]{0,1},f->new int[]{f[1],f[0]+f[1]})
		.limit(num)
		.map(f->f[0])
		.forEach(System.out::println);
	}


}
