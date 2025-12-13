package com.uttara.string.techchefs;

public class PalindromePermutationProgram {
	public static void main(String args[])
	{
		PalindromePermutationProgram palindromePermutationProgram = new PalindromePermutationProgram();
		System.out.println(palindromePermutationProgram.checkIsgivenStringPalindromeUsingStringBufferReverseMethod("madam"));
		System.out.println(palindromePermutationProgram.checkWeatherTheGivenNumbersArePalindromOrNot(99));
		System.out.println(palindromePermutationProgram.checkIsgivenStringPalindromeWithoutUsingInBuiltFunctions("LIRIL"));
	}
	
	public boolean checkIsgivenStringPalindromeUsingStringBufferReverseMethod(String str) {
		String orginalString = str;
		StringBuffer stringBuffer = new StringBuffer(orginalString);
		String reversString=stringBuffer.reverse().toString();
		if(orginalString.equalsIgnoreCase(reversString))
		{
			return true; 
		}
		else
		{
			return false;
		}
	}
	public boolean checkIsgivenStringPalindromeWithoutUsingInBuiltFunctions(String str) {
		String orginalString = str;
		String reverseString="";
		System.out.println(str.length());
		for (int i = str.length()-1; i >= 0; i--) {
			reverseString = reverseString+str.charAt(i);
		}
		if(reverseString.equalsIgnoreCase(orginalString))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean checkWeatherTheGivenNumbersArePalindromOrNot(int num) {
		int rev_num = 0;
		int orginalNumber=num;
		while(num>0)
		{
			rev_num = rev_num * 10 + num % 10;
			num = num/10;
		}
		if(rev_num == orginalNumber)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
