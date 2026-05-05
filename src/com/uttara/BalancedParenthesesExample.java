package com.uttara;

import java.util.Stack;

public class BalancedParenthesesExample {
    public
    static boolean balancedParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == ')' && top != '(') ||
                        (c == ')' && top != '(')) {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

    public
    static void main(String[] args) {
        String str = "{[()]}";
        if (balancedParenthesis(str))
            System.out.println("True");
        else
            System.out.println("False");
    }
}