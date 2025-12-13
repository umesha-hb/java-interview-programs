package com.uttara;

import java.util.Optional;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "Aza";
        int vCount = 0, cCount = 0;
        Optional<String> strOptional = Optional.ofNullable(str);
        boolean isPresent = strOptional.isPresent();
        System.out.println("isPresent: " + isPresent);
        if (strOptional.isPresent()) {
            str = strOptional.get();
        } else {
            System.out.println("String is null");
            return;
        }
        str = str.toLowerCase();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (str.charAt(str.indexOf(ch[i])) == 'a' || str.charAt(str.indexOf(ch[i])) == 'e'
                    || str.charAt(str.indexOf(ch[i])) == 'i' || str.charAt(str.indexOf(ch[i])) == 'o'
                    || str.charAt(str.indexOf(ch[i])) == 'u') {
                vCount++;
            } else {
                cCount++;
            }
        }
        System.out.println("Vowels: " + vCount);
        System.out.println("consonants: " + cCount);
    }
}
