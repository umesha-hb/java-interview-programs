package com.utttara.strings;

public class SentenceCounter {
    public static int countSentences(String text) {
        int count = 0;
        boolean continous = false;

        for (char c : text.toCharArray()) {
            if (c == '.' || c == '!' || c == '?') {
               if (!continous) {
                    count++;
                   continous = true;
               }
          } else {
                continous = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String text = "Hello! How are you?? I am fine. This is great...";
        System.out.println(countSentences(text));
    }
}