package directed_graph;


import graph.Edge;
import graph.Graph;

import java.util.List;

public class StringGraphBuilder {



    void buildGraph(List<String> vertexes, List<Edge<String>> edges, Graph<String> graph) {
        for (String vertex : vertexes) graph.addVertex(vertex);
        for (Edge<String> edge : edges) graph.addEdge(edge);
    }
}
