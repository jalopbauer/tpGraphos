package directed_graph;

import graph.DirectedGraph;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RemoveVertexTest {

    StringGraphBuilder stringGraphBuilder = new StringGraphBuilder();
    @Test
    public void deleteOneVertex() {
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
    private void buildAndTest(String[] toVertexes) {
        String[] vertexes = {"A", "B", "C"};
        DirectedGraph<String> directedGraph = new DirectedGraph<>();
        stringGraphBuilder.buildGraph(vertexes, directedGraph);
        vertexExistsTest(directedGraph, toVertexes);
    }

    private void vertexExistsTest(DirectedGraph<String> directedGraph, String[] strings) {
        for (String string : strings) {
            directedGraph.deleteVertex(string);
        }
        for (String string : strings) {
            assertFalse(directedGraph.existsVertex(string));
        }
    }

}
