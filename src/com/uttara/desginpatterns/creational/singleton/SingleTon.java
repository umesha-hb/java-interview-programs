package com.uttara.desginpatterns.creational.singleton;

public class SingleTon {

	private static volatile SingleTon instance;

	private SingleTon() {
		// private constructor
	}

	public static SingleTon getInstance() {
		if (instance == null) {                 // First check (no lock)
			synchronized (SingleTon.class) {
				if (instance == null) {         // Second check (with lock)
					instance = new SingleTon();
				}
			}
		}
		return instance;
	}
}


	class Tester {
		public static void main(String[] args) {
			SingleTon.getInstance();
		}
	}

