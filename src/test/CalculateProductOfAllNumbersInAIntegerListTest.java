package test;

import com.interview.epam.CalculateProductOfAllNumbersInAIntegerList;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculateProductOfAllNumbersInAIntegerListTest {

    @Test
    void testProductOfPositiveNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer result = CalculateProductOfAllNumbersInAIntegerList.calculateProduct(numbers);
        assertEquals(120, result);
    }

    @Test
    void testProductWithSingleElement() {
        List<Integer> numbers = Arrays.asList(5);
        Integer result = CalculateProductOfAllNumbersInAIntegerList.calculateProduct(numbers);
        assertEquals(5, result);
    }

    @Test
    void testProductWithZero() {
        List<Integer> numbers = Arrays.asList(1, 2, 0, 4);
        Integer result = CalculateProductOfAllNumbersInAIntegerList.calculateProduct(numbers);
        assertEquals(0, result);
    }

    @Test
    void testProductWithNegativeNumbers() {
        List<Integer> numbers = Arrays.asList(-1, 2, -3);
        Integer result = CalculateProductOfAllNumbersInAIntegerList.calculateProduct(numbers);
        assertEquals(6, result);
    }

    @Test
    void testProductOfEmptyList() {
        List<Integer> numbers = Collections.emptyList();
        Integer result = CalculateProductOfAllNumbersInAIntegerList.calculateProduct(numbers);
        assertEquals(1, result); // identity value
    }
}
