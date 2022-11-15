package application;

import graph.DirectedGraph;
import graph.Edge;
import graph.methods.Warshall;

import java.util.ArrayList;
import java.util.List;

public class TransportNet<T> {
    private final List<Edge<T>> edges;
    private final DirectedGraph<T> graph = new DirectedGraph<>();
    private final boolean[][] warshalMatrix;

    public TransportNet(List<Edge<T>> edges){
        this.edges = edges;
        for (Edge<T> edge : edges) {
            this.graph.addVertex(edge.getFromVertex());
            this.graph.addVertex(edge.getToVertex());
            this.graph.addEdge(edge);
        }
        Warshall<T> warshall = new Warshall<>();
        this.warshalMatrix = warshall.warshallize(graph);
    }

    boolean isConected(T fromVertex, T toVertex){
        List<T> vertexes = new ArrayList<>(graph.getVertexes());
        int formIndex = vertexes.indexOf(fromVertex);
        int toIndex = vertexes.indexOf((toVertex));
        return warshalMatrix[formIndex][toIndex];
    }

    public List<Edge<T>> getEdges(){
        return edges;
    }

    public boolean[][] getWarshalMatrix(){
        return warshalMatrix;
    }
}
