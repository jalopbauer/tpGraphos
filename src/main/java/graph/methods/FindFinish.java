package graph.methods;

import graph.Graph;

import java.util.Set;

public class  FindFinish<T> {
    public Set<T> find(Graph<T> graph){
        Set<T> vertexes = new java.util.HashSet<>(Set.copyOf(graph.getVertexes()));
        vertexes.removeIf(vertex -> !graph.getAdyListForVertex(vertex).isEmpty());
        return vertexes;
    }
}
