package com.uttara.java8.optionaldemo;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {  
        String[] str = new String[10]; 
        str[0] = "umesha";
        str[1] = "umesha1";
        Optional<String> checkNull = Optional.ofNullable(str[5]);  
        if(checkNull.isPresent()){  // check for value is present or not  
            String lowercaseString = str[0].toUpperCase();  
            System.out.print(lowercaseString);  
        }else  
            System.out.println("string value is not present");  
    }  
	 
}
