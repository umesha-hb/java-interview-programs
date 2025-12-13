package com.uttara.fibnocci;


public class FibonacciSeries {

	public static void main(String[] args) {
		fibonacci(10);
	}

	static void fibonacci(int n) {
		int a = 0, b = 1;
		int counter = 0;
		while (counter <=n) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
			counter++;
		}
		
	}

}
