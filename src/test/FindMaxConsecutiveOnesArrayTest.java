package test;

import com.utttara.arrays.FindMaxConsecutiveOnesArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMaxConsecutiveOnesArrayTest {
    @Test
    void testNormalCase() {
        int[] nums = {1,1,0,1,1,1};
        assertEquals(3, FindMaxConsecutiveOnesArray.findMaxConsecutiveOnes(nums));
    }
    @Test
    void testAllOnes() {
        int[] nums = {1,1,1,1,1};
        assertEquals(5, FindMaxConsecutiveOnesArray.findMaxConsecutiveOnes(nums));
    }
    @Test
    void testAllZeros() {
        int[] nums = {0,0,0,0};
        assertEquals(0, FindMaxConsecutiveOnesArray.findMaxConsecutiveOnes(nums));
    }
    @Test
    void testSingleElementOne() {
        int[] nums = {1};
        assertEquals(1, FindMaxConsecutiveOnesArray.findMaxConsecutiveOnes(nums));
    }
    @Test
    void testSingleElementZero() {
        int[] nums = {0};
        assertEquals(0, FindMaxConsecutiveOnesArray.findMaxConsecutiveOnes(nums));
    }
    @Test
    void testAlternatingPattern() {
        int[] nums = {1,0,1,0,1,0,1};
        assertEquals(1, FindMaxConsecutiveOnesArray.findMaxConsecutiveOnes(nums));
    }
    @Test
    void testLongestAtBeginning() {
        int[] nums = {1,1,1,0,0,1};
        assertEquals(3, FindMaxConsecutiveOnesArray.findMaxConsecutiveOnes(nums));
    }
    @Test
    void testLongestAtEnd() {
        int[] nums = {0,0,1,1,1};
        assertEquals(3, FindMaxConsecutiveOnesArray.findMaxConsecutiveOnes(nums));
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        assertEquals(0, FindMaxConsecutiveOnesArray.findMaxConsecutiveOnes(nums));
    }
}
