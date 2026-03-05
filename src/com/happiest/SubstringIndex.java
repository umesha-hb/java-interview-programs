package com.happiest;

public class SubstringIndex {
    public static void main(String args[])
    {
        String str="i am an engineer";
        String substring1 = "engine";
        String substring2 = "neer";

        System.out.println(str.indexOf(substring1)); // 8
        System.out.println(str.indexOf(substring2)); // 12
    }
}
