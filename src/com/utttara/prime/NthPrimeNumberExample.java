package com.utttara.prime;
//A prime number is a number greater than 1 that is divisible only by 1 and itself.
public class NthPrimeNumberExample {

	public static void main(String[] args)
	{
		int n = 100;  // find 100th prime
		int count = 0;
		int num = 1;

		while (count < n) {
			num++;
			if (isPrime(num)) {
				count++;
			}
		}
		System.out.println("100th prime number is: " + num);

	}
	static boolean isPrime(int n) {
		boolean isPrime = true;
		if (n <= 1) return false;
		for (int i = 2; i <n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
