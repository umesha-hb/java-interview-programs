package test;

import com.epam.AnagramGrouper;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnagramGrouperTest {

    @Test
    void testGivenExample() {
        List<String> input = Arrays.asList(
                "listen", "silent", "enlist", "googel", "gooegl",
                "inlets", "cat", "act", "tac", "dog"
        );

        List<List<String>> expected = Arrays.asList(
                Arrays.asList("enlist", "inlets", "listen", "silent"),
                Arrays.asList("act", "cat", "tac"),
                Arrays.asList("gooegl", "googel"),
                Arrays.asList("dog")
        );

        List<List<String>> actual = AnagramGrouper.groupAndSortAnagrams(input);

        assertEquals(expected, actual);
    }

    @Test
    void testSingleWord() {
        List<String> input = Collections.singletonList("hello");

        List<List<String>> expected = Collections.singletonList(
                Collections.singletonList("hello")
        );

        assertEquals(expected, AnagramGrouper.groupAndSortAnagrams(input));
    }

    @Test
    void testAllAnagrams() {
        List<String> input = Arrays.asList("abc", "bca", "cab");

        List<List<String>> expected = Collections.singletonList(
                Arrays.asList("abc", "bca", "cab")
        );

        assertEquals(expected, AnagramGrouper.groupAndSortAnagrams(input));
    }

    @Test
    void testNoAnagrams() {
        List<String> input = Arrays.asList("dog", "cat", "bird");

        List<List<String>> expected = Arrays.asList(
                Arrays.asList("bird"),
                Arrays.asList("cat"),
                Arrays.asList("dog")
        );

        assertEquals(expected, AnagramGrouper.groupAndSortAnagrams(input));
    }

    @Test
    void testEmptyInput() {
        List<String> input = Collections.emptyList();

        List<List<String>> expected = Collections.emptyList();

        assertEquals(expected, AnagramGrouper.groupAndSortAnagrams(input));
    }

    @Test
    void testCaseSensitivity() {
        List<String> input = Arrays.asList("Listen", "Silent", "listen");

        List<List<String>> result = AnagramGrouper.groupAndSortAnagrams(input);

        // "Listen" and "Silent" are anagrams, "listen" is separate due to case
        assertEquals(2, result.size());
        assertEquals(Arrays.asList("Listen", "Silent"), result.get(0));
        assertEquals(Collections.singletonList("listen"), result.get(1));
    }
}

