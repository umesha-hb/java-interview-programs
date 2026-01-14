package com.uttara.twosum.techchefs;

public class TwoStringsAsInput {

	public static void main(String[] args) {
	 String s1 = "OP134";
	 String s2 = "OP135";
	 TwoStringsAsInput twoStrAsInput = new TwoStringsAsInput();
	 System.out.println("----OUTPUT-----");
	 System.out.println("op1 =" +twoStrAsInput.remove(s1, s2));


	} 
   public String remove(String str1,String str2)
   {
	   String strnew = "";
	   int l1 = str1.length();
	    int l2 = str2.length();
	    for (int i = 0; i < l1; i++)
	    {
	        char ch1 = str1.charAt(i);
	        boolean isMatched = false;
	        for (int k = 0; k < l2; k++) 
	        {
	            char ch2 = str2.charAt(k);
	            if (ch1 == ch2)
	            {
	                isMatched = true;
	                break;
	            }
	        }
	        if(!isMatched) 
	        {
	            strnew = strnew +  ch1;
	        }
	    }
	    return strnew == "" ? "<null>" : strnew;
   }
}

