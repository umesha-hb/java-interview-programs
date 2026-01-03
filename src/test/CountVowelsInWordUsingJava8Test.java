package test;

import com.epam.CountVowelsInWordUsingJava8;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CountVowelsInWordUsingJava8Test {

    @Test
    void shouldCountVowelsForEachWord() {
        List<String> words =
                Arrays.asList("Apple", "Java", "Stream", "Interview");

        Map<String, Long> result =
                CountVowelsInWordUsingJava8.countVowels(words);

        assertEquals(2L, result.get("Apple"));      // A, e
        assertEquals(2L, result.get("Java"));       // a, a
        assertEquals(2L, result.get("Stream"));     // e, a
        assertEquals(4L, result.get("Interview"));  // i, e, i, e
    }
    @Test
    void shouldReturnEmptyMapForEmptyList() {
        Map<String, Long> result =
                CountVowelsInWordUsingJava8.countVowels(List.of());

        assertTrue(result.isEmpty());
    }
    @Test
    void shouldReturnZeroForWordsWithoutVowels() {
        List<String> words = List.of("bcdf");

        Map<String, Long> result =
                CountVowelsInWordUsingJava8.countVowels(words);

        assertEquals(0L, result.get("bcdf"));
    }
    @Test
    void shouldHandleSingleWord() {
        List<String> words = List.of("AEIOU");

        Map<String, Long> result =
                CountVowelsInWordUsingJava8.countVowels(words);

        assertEquals(5L, result.get("AEIOU"));
    }

}

