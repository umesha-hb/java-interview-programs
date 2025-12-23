package com.uttara;

import java.io.IOException;

public class CatchErrorExample {
    public static void main(String[] args) {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError! But usually you shouldn't do this.");
        }
    }

    public static void recursiveMethod() {
        recursiveMethod(); // infinite recursion
    }
}
