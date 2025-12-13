package com.uttara.fibnocci;

public class RecursiveFibnocci {

	public static void main(String[] args) {
		System.out.println(recursiveFibonacci(10));

	}
	static int recursiveFibonacci(int n) {
		if((n == 0) || (n == 1)) 
		{
			return n;
		}
		else
		{
			return recursiveFibonacci(n - 2)+recursiveFibonacci(n - 1);
		}
	}
}
