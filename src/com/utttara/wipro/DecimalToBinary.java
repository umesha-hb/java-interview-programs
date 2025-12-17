package com.utttara.wipro;


import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;


public class DecimalToBinary {
	public int[] solution(int num)
	{
		int binary[] = new int[35];
		int id=0;
		while (num > 0) {
			binary[id++]=num % 2;           
            num = num / 2;
        }
 
		
		return binary;
	}

	public static void main(String[] args) {
		DecimalToBinary  decimalToBinary = new DecimalToBinary();
	//	System.out.println(Arrays.toString(decimalToBinary.solution(7)));
		
		List<Integer> al = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		IntSummaryStatistics stat = al.stream().mapToInt(i->i).summaryStatistics();
		System.out.println("count : "+stat.getCount());
		System.out.println("min : "+stat.getMin());	
		System.out.println("average : "+stat.getAverage());
		System.out.println("max : "+stat.getMax());
		
	}

}
