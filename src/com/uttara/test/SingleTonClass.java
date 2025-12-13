package com.uttara.test;

public class SingleTonClass
{
	private static  SingleTonClass singleTonClass = null;
	 private SingleTonClass()
	 {
		 
	 }
	 public static   SingleTonClass   getInsatnce()
	 {
		 
		 if(singleTonClass==null)
		 {
			 synchronized (singleTonClass) {
				 SingleTonClass singleTonClass =  new SingleTonClass();
				 return singleTonClass;
			}
			 
		 }
		 else
		 {
			 return singleTonClass;
		 }
	 } 
}
class Tester
{
	public static void main(String[] args)
	{
		SingleTonClass.getInsatnce();
	}
}
