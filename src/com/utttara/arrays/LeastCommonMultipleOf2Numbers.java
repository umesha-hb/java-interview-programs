package com.utttara.arrays;

public class LeastCommonMultipleOf2Numbers {
    public static void main(String[] args) {
        /*
        LCM(a,b)=a×b/GCD(a,b)
         */
        int a=12;
        int b=18;
        System.out.println(a*b/findGCD(a,b));
    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
