package directed_graph;

import graph.DirectedGraph;
import graph.Edge;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RemoveEdgeTest {

    StringGraphBuilder stringGraphBuilder = new StringGraphBuilder();
    String[] vertexes = {"A", "B", "C", "D", "E"};
    Edge<String> ab = new Edge<>("A", "B");
    Edge<String> ac = new Edge<>("A", "C");
    Edge<String> de = new Edge<>("D", "E");

    @Test
    public void deleteOneEdge() {
        Edge<String>[] edges = new Edge[1];
        edges[0] = ab;
        buildAndTest(edges);
    }

    @Test
    public void persistTwoEdge() {
        Edge<String>[] edges = new Edge[2];
        edges[0] = ab;
        edges[1] = ac;
        buildAndTest(edges);
    }

    @Test
    public void persistThreeEdge() {
        Edge<String>[] edges = new Edge[3];
        edges[0] = ab;
        edges[1] = ac;
        edges[2] = de;
        buildAndTest(edges);
    }

    private void buildAndTest(Edge<String>[] toDeleteEdges) {
        Edge<String>[] edges = new Edge[3];
        edges[0] = ab;
        edges[1] = ac;
        edges[2] = de;
        DirectedGraph<String> directedGraph = new DirectedGraph<>();
        stringGraphBuilder.buildGraph(vertexes, edges, directedGraph);
        edgesExistsTest(directedGraph, toDeleteEdges);
    }

    private void edgesExistsTest(DirectedGraph<String> directedGraph, Edge<String>[] edges) {
        for (Edge<String> edge : edges) {
            directedGraph.deleteEdge(edge);
        }
        for (Edge<String> edge : edges) {
            assertFalse(directedGraph.existsEdge(edge));
        }
    }

}
