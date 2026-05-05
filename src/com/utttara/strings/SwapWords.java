package com.utttara.strings;

import java.util.*;
import java.util.regex.*;

public class SwapWords {
    public static void main(String[] args) {
        String input = "Hello@123World3242!@#";
        List<String> words = new ArrayList();
        Matcher m =Pattern.compile("[A-Za-z]+").matcher(input);
        while(m.find())
        {
            words.add(m.group());
        }
        Collections.reverse(words);
        StringBuilder stringBuilder = new StringBuilder();
        int index=0;
        m =Pattern.compile("[A-Za-z]+").matcher(input);
        while (m.find())
        {
            m.appendReplacement(stringBuilder,words.get(index++));
        }
        m.appendTail(stringBuilder);
        System.out.println(stringBuilder.toString());


    }
}

