package application;

import graph.DirectedGraph;
import graph.Edge;
import graph.methods.Warshall;

import java.util.*;

public class TransportNet<T> {
    private final List<Edge<T>> edges;
    private final DirectedGraph<T> graph = new DirectedGraph<>();
    private final  Map<T, Map<T, Boolean>> constantWarshalMatrix;

    public TransportNet(List<Edge<T>> edges){
        this.edges = edges;
        for (Edge<T> edge : edges) {
            this.graph.addVertex(edge.getFromVertex());
            this.graph.addVertex(edge.getToVertex());
            this.graph.addEdge(edge);
        }
        Warshall<T> warshall = new Warshall<>();
        boolean[][] warshalMatrix = warshall.warshallize(graph);
        this.constantWarshalMatrix = constantWarshall(warshalMatrix);
    }

    Map<T, Map<T, Boolean>> constantWarshall(boolean[][] warshallMatrix){
        Map<T, Map<T, Boolean>> constantWarshall = new HashMap<>();
        List<T> vertexes = new ArrayList<>(graph.getVertexes());
        for(int i =0; i < warshallMatrix.length; i++){
            HashMap<T, Boolean> map = new HashMap<>();
            for(int j = 0; j < warshallMatrix[i].length; j++){
                map.put(vertexes.get(j), warshallMatrix[i][j]);
            }
            constantWarshall.put(vertexes.get(i), map);

        }
        return constantWarshall;
    }

    boolean isConected(T fromVertex, T toVertex){
        return constantWarshalMatrix.get(fromVertex).get(toVertex);
    }

    public List<Edge<T>> getEdges(){
        return edges;
    }

    public Map<T, Map<T, Boolean>> getConstantWarshalMatrix(){
        return constantWarshalMatrix;
    }
}
