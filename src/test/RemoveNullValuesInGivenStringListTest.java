package test;

import com.uttara.java8.RemoveNullValuesInGivenStringList;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNullValuesInGivenStringListTest {

    @Test
    void shouldRemoveNullValuesFromList() {
        // Given
        List<String> input = Arrays.asList("Java", null, "JUnit", null, "Stream");

        // When
        List<String> result =
                RemoveNullValuesInGivenStringList.removeNullValuesInGivenList(input);

        // Then
        assertEquals(3, result.size());
        assertFalse(result.contains(null));
        assertEquals(Arrays.asList("Java", "JUnit", "Stream"), result);
    }

    @Test
    void shouldReturnEmptyListWhenAllValuesAreNull() {
        // Given
        List<String> input = Arrays.asList(null, null, null);

        // When
        List<String> result =
                RemoveNullValuesInGivenStringList.removeNullValuesInGivenList(input);

        // Then
        assertTrue(result.isEmpty());
    }

    @Test
    void shouldReturnSameListWhenNoNullValuesPresent() {
        // Given
        List<String> input = Arrays.asList("A", "B", "C");

        // When
        List<String> result =
                RemoveNullValuesInGivenStringList.removeNullValuesInGivenList(input);

        // Then
        assertEquals(input, result);
    }
}

