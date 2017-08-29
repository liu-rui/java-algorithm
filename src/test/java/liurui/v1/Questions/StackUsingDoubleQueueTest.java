package liurui.v1.Questions;

import liurui.v2.questions.StackUsingDoubleQueue;
import org.junit.Test;

import  static  org.junit.Assert.*;

public class StackUsingDoubleQueueTest {

    @Test
    public void test() {
        liurui.v2.questions.StackUsingDoubleQueue item = new StackUsingDoubleQueue();

        item.push(10);
        item.push(45);
        item.push(23);
        item.push(56);

        assertEquals(4 , item.getSize());
        assertEquals(56 , item.pop());
        assertEquals(23 , item.pop());
        assertEquals(45 , item.pop());
        assertEquals(10 , item.pop());
    }
}