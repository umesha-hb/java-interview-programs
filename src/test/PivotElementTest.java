package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.uttara.sorting.PivotElement;
import org.junit.jupiter.api.Test;

class PivotElementTest {

    @Test
    void shouldReturnPivotIndexWhenPivotExists() {
        int[] input = {1, 7, 3, 6, 5, 6};
        int result = PivotElement.pivotIndex(input);
        assertEquals(3, result);
    }

    @Test
    void shouldReturnMinusOneWhenNoPivotExists() {
        int[] input = {1, 2, 3};
        int result = PivotElement.pivotIndex(input);
        assertEquals(-1, result);
    }

    @Test
    void shouldReturnZeroWhenSingleElementArray() {
        int[] input = {10};
        int result = PivotElement.pivotIndex(input);
        assertEquals(0, result);
    }

    @Test
    void shouldHandleArrayWithZeros() {
        int[] input = {0, 0, 0};
        int result = PivotElement.pivotIndex(input);
        assertEquals(0, result);
    }

    @Test
    void shouldHandleNegativeNumbers() {
        int[] input = {2, 1, -1};
        int result = PivotElement.pivotIndex(input);
        assertEquals(0, result);
    }

    @Test
    void shouldReturnFirstPivotIfMultiplePivotsExist() {
        int[] input = {0, 1, -1, 0};
        int result = PivotElement.pivotIndex(input);
        assertEquals(0, result);
    }
}

