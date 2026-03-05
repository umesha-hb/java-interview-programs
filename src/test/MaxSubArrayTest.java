package test;
import com.utttara.arrays.MaximumSubarray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MaxSubArrayTest {
    @Test
    void testPositiveAndNegativeNumbers() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = MaximumSubarray.maxSubArray(nums);
        assertEquals(6, result);
    }

    @Test
    void testAllNegativeNumbers() {
        int[] nums = {-3,-1,-2};
        int result = MaximumSubarray.maxSubArray(nums);
        assertEquals(-1, result);
    }

    @Test
    void testSingleElement() {
        int[] nums = {5};
        int result = MaximumSubarray.maxSubArray(nums);
        assertEquals(5, result);
    }
}
