package com.utttara.wipro;

public class IntToBinary {
    public static void main(String[] args) {

        int num = 10;
        String binary = "";

        while (num > 0) {
            binary = binary+(num % 2);
            num = num / 2;
        }

        System.out.println(binary);
    }

}
