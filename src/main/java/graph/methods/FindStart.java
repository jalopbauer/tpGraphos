package graph.methods;

import graph.Graph;

import java.util.List;
import java.util.Set;

public class FindStart<T> {

    public Set<T> find(Graph<T> graph){
        Set<T> vertexes = new java.util.HashSet<>(Set.copyOf(graph.getVertexes()));
        for (T vertex : vertexes) {
            for (T vertexInAdyList : graph.getAdyListForVertex(vertex)) {
                vertexes.remove(vertexInAdyList);
            }
        }
        return vertexes;
    }
}
