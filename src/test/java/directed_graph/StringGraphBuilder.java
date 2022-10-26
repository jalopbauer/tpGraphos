package directed_graph;


import graph.Edge;
import graph.Graph;

import java.util.ArrayList;
import java.util.List;

public class StringGraphBuilder {


    void emptyGraph(Graph<String> graph) {
        buildGraph(new ArrayList<>(), new ArrayList<>(), graph);
    }

    void buildGraph(List<String> vertexes, List<Edge<String>> edges, Graph<String> graph) {
        for (String vertex : vertexes) graph.addVertex(vertex);
        for (Edge<String> edge : edges) graph.addEdge(edge);
    }
}
