package liurui.defines.structures.array;

import static org.junit.Assert.assertArrayEquals;

public class FindMaxSumSubArrayTest {
    public void test(FindMaxSumSubArray item) {
        assertArrayEquals(new int[]{1, 2, 3, -1, 2}, item.find(new int[]{3, -6, 1, 2, 3, -1, 2, -5, 1, 2}));
    }
}