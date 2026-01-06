package com.uttara.twosum.infixtopostifix;
public class UserInput {
    
    public static class TextInput 
    {
          String input="";
         public void add(char c)
        {
           
            input = input+c;
        }
         public String getValue()
         {             
             return input;
         }
    }

    public static class NumericInput extends TextInput {
        
        String input=""; 
        
        public void add(char c)
        {
        	if(Character.isDigit(c))
            input = input+c;
        }
        public String getValue(){
           
            return input;
        }
    }

    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);
       TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
