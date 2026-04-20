package com.interview.refelections;

import java.util.stream.IntStream;

public class PrintNumbersOneToFifty {
    public static void main(String args[])
    {

        IntStream.range(0,50).filter(i->i%3==0).forEach(System.out::println);
    }
}
