package test;

import com.interview.epam.FristNonRepetableWordInGivenSentence;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class FirstNonRepeatingWordTest {

    @Test
    void testFirstNonRepeatingWord() {
        String input = "Java is fun and Java is powerful";

        String result = FristNonRepetableWordInGivenSentence.findFirstNonRepeatingWord(input);

        assertEquals("fun", result);
    }

    @Test
    void testSingleWord() {
        String input = "Hello";

        String result = FristNonRepetableWordInGivenSentence.findFirstNonRepeatingWord(input);

        assertEquals("Hello", result);
    }

    @Test
    void testAllRepeatingWords() {
        String input = "Java Java Java";

        assertThrows(NoSuchElementException.class, () ->
                FristNonRepetableWordInGivenSentence.findFirstNonRepeatingWord(input)
        );
    }

    @Test
    void testMultipleNonRepeatingWords() {
        String input = "one two three two one four";

        String result = FristNonRepetableWordInGivenSentence.findFirstNonRepeatingWord(input);

        assertEquals("three", result);
    }
}

