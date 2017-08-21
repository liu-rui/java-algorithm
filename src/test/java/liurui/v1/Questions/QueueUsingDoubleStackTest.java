package liurui.v1.Questions;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueUsingDoubleStackTest {
    @Test
    public void test(){
        QueueUsingDoubleStack  item = new QueueUsingDoubleStack();

        item.push(10);
        item.push(45);
        item.push(23);
        item.push(56);

        assertEquals(4 , item.getSize());
        assertEquals(10 , item.pop());
        assertEquals(45 , item.pop());
        assertEquals(23 , item.pop());
        assertEquals(56 , item.pop());
    }

}