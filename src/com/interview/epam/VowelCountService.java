package com.interview.epam;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class  VowelCountService {

    private final WordRepository wordRepository;

    public VowelCountService(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    public Map<String, Long> countVowels() {
        return wordRepository.fetchWords()
                .stream()
                .collect(Collectors.toMap(
                        word -> word,
                        word -> word.toLowerCase()
                                .chars()
                                .filter(c -> "aeiou".indexOf(c) != -1)
                                .count()
                ));
    }
    public static void main(String[] args)
    {
        String str = "Interview";
        Map<String, Long> map = Stream.of(str).
                collect(Collectors.toMap(Function.identity(),
                        word -> word.toLowerCase().chars().
                                filter(c -> "aeiou".indexOf(c) != -1).count()));
        System.out.println("Vowles Count : "+map.values());

    }
}
