package com.utttara.prime;

public class PrimeNumber {

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int number = 29;

		if (isPrime(number)) {
			System.out.println(number + " is a Prime Number");
		} else {
			System.out.println(number + " is not a Prime Number");
		}
	}
}
