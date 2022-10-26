package directed_graph;

import graph.DirectedGraph;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrderTest {

    StringGraphBuilder stringGraphBuilder = new StringGraphBuilder();
    @Test
    public void persistOneVertex() {
        String[] vertexes = {"A"};
        buildAndTest(vertexes);
    }

    @Test
    public void persistTwoVertexes() {
        String[] vertexes = {"A", "B"};
        buildAndTest(vertexes);
    }

    @Test
    public void persistThreeVertexes() {
        String[] vertexes = {"A", "B", "C"};
        buildAndTest(vertexes);
    }
    private void buildAndTest(String[] vertexes) {
        DirectedGraph<String> directedGraph = new DirectedGraph<>();
        stringGraphBuilder.buildGraph(vertexes, directedGraph);
        vertexExistsTest(directedGraph, vertexes);
    }

    private void vertexExistsTest(DirectedGraph<String> directedGraph, String[] strings) {
        assertEquals(strings.length,directedGraph.order());

    }

}
