package directed_graph;


import graph.Edge;
import graph.Graph;
import org.junit.Test;

import java.util.List;

public class VertexPersistenceTest {

    void buildGraph(List<String> vertexes, List<Edge<String>> edges, Graph<String> graph) {
        for (String vertex : vertexes) graph.addVertex(vertex);
        for (Edge<String> edge : edges) graph.addEdge(edge);
    }
}
