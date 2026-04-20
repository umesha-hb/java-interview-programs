package com.uttara.infixtopostifix;

import java.util.Stack;

public class StringInfixToPostFix {

    // Function to check precedence

    public static String infixToPostfix(String exp) {
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char ch : exp.toCharArray()) {
            if(ch==' ')continue;
            if (Character.isLetterOrDigit(ch))
                stringBuilder.append(ch);
            else if (ch == '(')
                stack.push(ch);
                // If ')', pop until '('
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stringBuilder.append(stack.pop());
                }
                stack.pop(); // remove '('
            }
            // If operator
            else {
                while (!stack.isEmpty() &&
                        precedence(ch) <= precedence(stack.peek())) {
                    stringBuilder.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        // Pop remaining operators
        while (!stack.isEmpty())
        {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }

    private static int precedence(char ch)
    {
        if(ch=='+'||ch=='-')
            return 1;
        if(ch=='*'||ch=='/')
            return 2;
        if(ch=='^')
            return 3;
        return -1;
    }

    public static void main(String[] args) {
        String exp = "(A + B) * (C - D) / E";
        System.out.println("Postfix: " + infixToPostfix(exp));
    }
}
