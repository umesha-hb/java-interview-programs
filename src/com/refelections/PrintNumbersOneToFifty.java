package com.refelections;

import java.util.stream.IntStream;

public class PrintNumbersOneToFifty {
    public static void main(String args[])
    {

        IntStream.range(0,50).forEach(System.out::println);
    }
}
