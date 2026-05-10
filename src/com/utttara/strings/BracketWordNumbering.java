package com.utttara.strings;

import java.util.*;
import java.util.regex.*;

public class BracketWordNumbering {

    public static void main(String[] args) {
        String text = "This is[apple] and [banana]. Another [apple] and [orange].";

        Map<String, Integer> wordNumbers = new LinkedHashMap<>();
        Matcher matcher = Pattern.compile("\\[(.*?)\\]").matcher(text);

        int counter = 1;

        // Find unique words and assign numbers
        while (matcher.find())
        {
            String word = matcher.group(1);

            if (!wordNumbers.containsKey(word))
            {
                wordNumbers.put(word, counter++);
            }
        }
        System.out.println(wordNumbers);
         for (Map.Entry<String, Integer> entry : wordNumbers.entrySet())
        {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
   }
}
