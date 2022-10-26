package directed_graph;


import graph.Edge;
import graph.Graph;

public class StringGraphBuilder {

    void buildGraph(String[] vertexes, Graph<String> graph){
        Edge<String>[] edges = new Edge[0];
        buildGraph(vertexes, edges, graph);
    }
    void buildGraph(String[] vertexes, Edge<String>[] edges, Graph<String> graph) {
        for (String vertex : vertexes) graph.addVertex(vertex);
        for (Edge<String> edge : edges) graph.addEdge(edge);
    }
}
