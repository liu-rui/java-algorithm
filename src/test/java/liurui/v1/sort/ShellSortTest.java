package liurui.v1.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShellSortTest {
    @Test
    public void sort() throws Exception {
        assertArrayEquals(new int[]{1,1,3,5,5,6,7,9,9}, new ShellSort().sort(new int[]{5,9,1,9,5,3,7,6,1}));
    }

}