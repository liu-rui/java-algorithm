package liurui.defines.structures.graph;

import liurui.v4.structures.graph.GraphUsingListImpl;
import org.junit.Test;

public class GraphUsingListTest {
    @Test
    public void test() {
        GraphUsingList graph = new GraphUsingListImpl();

        GraphTest graphTest = new GraphTest();

        graphTest.test(graph);
        graphTest.testSearch(graph);
        graphTest.testShortestPath(graph);
    }
}
