package com.epam;

import java.util.Map;
import java.util.stream.Collectors;

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
}
