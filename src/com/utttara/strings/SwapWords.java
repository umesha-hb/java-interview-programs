package com.utttara.strings;

import java.util.*;
import java.util.regex.*;

public class SwapWords {
    public static void main(String[] args) {
        String input = "Hello@123World3242!@#a";

        // Step 1: Extract all alphabetic words
        List<String> words = new ArrayList<>();
        Matcher m = Pattern.compile("[A-Za-z]+").matcher(input);
        while (m.find()) {
                words.add(m.group());
        }
        System.out.println(words);

        // Step 2: Reverse the words
        Collections.reverse(words);
        System.out.println(words);

        // Step 3: Replace words in the input string with reversed order
        StringBuffer result = new StringBuffer();
        m = Pattern.compile("[A-Za-z]+").matcher(input);
        int index = 0;
        while (m.find()) {
            m.appendReplacement(result, words.get(index++));
        }
        m.appendTail(result);

        // Step 4: Print the result
        System.out.println(result.toString());
    }
}

