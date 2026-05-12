package com.uttara.fibnocci;


import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonacciSeries {

	public static void main(String[] args) {
		fibonacci(10);
	}

	static void fibonacci(int n) {
		int a = 0, b = 1;
		int counter = 0;
		while (counter <= n) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
			counter++;
		}
		Stream.iterate(new int[]{0,1},f->new int [] {f[1],f[0]+f[1]})
				.limit(10)
				.map(f->f[0])
				.forEach(System.out::println);
	}

}
