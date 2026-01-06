package test;

import com.uttara.java8.MergeMultipleListIntoOne;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeMultipleListIntoOneTest {
    @Test
    void shouldMergeMultipleListsIntoOne() {
        // Arrange
        List<List<Integer>> input = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5)
        );

        // Act
        List<Integer> result = MergeMultipleListIntoOne.MergeMultipleListIntoOne(input);

        // Assert
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnEmptyListWhenInputIsEmpty() {
        List<List<Integer>> input = List.of();

        List<Integer> result = MergeMultipleListIntoOne.MergeMultipleListIntoOne(input);

        assertEquals(List.of(), result);
    }
    @Test
    void shouldReturnSameListWhenOnlyOneInnerListExists() {
        List<List<Integer>> input = Arrays.asList(
                Arrays.asList(10, 20, 30)
        );

        List<Integer> result = MergeMultipleListIntoOne.MergeMultipleListIntoOne(input);

        assertEquals(Arrays.asList(10, 20, 30), result);
    }

}
