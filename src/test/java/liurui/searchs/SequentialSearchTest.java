package liurui.searchs;

import org.junit.Test;

import static org.junit.Assert.*;

public class SequentialSearchTest {
    @Test
    public void find() throws Exception {
        SequentialSearch search = new SequentialSearch();

        assertEquals(-1, search.find(new int[]{3, 5, 61, 5, 2}, 4));
        assertEquals(2, search.find(new int[]{3, 5, 61, 5, 2}, 61));
    }

}