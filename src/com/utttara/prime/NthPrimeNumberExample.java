package com.utttara.prime;

public class NthPrimeNumberExample {

	public static void main(String[] args)
	{
		int count = 0;
		int number = 1;

		while (count < 100) {
			number++;
			if (isPrime(number)) {
				count++;
			}
		}

		System.out.println("The 100th prime number is: " + number);
	}
	static boolean isPrime(int n) {
		if (n <= 1) return false;
		for (int i = 2; i <=Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
}
