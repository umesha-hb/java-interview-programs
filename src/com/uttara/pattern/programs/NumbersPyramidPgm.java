package com.uttara.pattern.programs;

public class NumbersPyramidPgm {

	public static void main(String[] args) {
		int rows=10,i,j;
		for(i=1;i<rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" "); 
			}
			System.out.println();
		}

	}

}
abstract class A
{
	public abstract void a();
	public  void b() {
		
	}
}
class B extends A
{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}
	
}
interface E
{
	static  void b() {
		
	}
}
interface C
{
	public void a();
	 static  void b() {
		
	}
}
class D implements C,E
{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	
	
}