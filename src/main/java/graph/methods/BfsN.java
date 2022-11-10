package graph.methods;

import graph.Graph;

import java.util.HashSet;
import java.util.Set;

public class BfsN<T> {

    public Set<T> find(Graph<T> graph, int n, T vertex){
        if (n == 0) return new HashSet<>();
        Set<T> vertexesAdylist = new java.util.HashSet<>(Set.copyOf(graph.getAdyListForVertex(vertex)));
        Set<T> result = new HashSet<>(vertexesAdylist);
        for (T vertexInAdyList : vertexesAdylist) {
            result.addAll(find(graph, n -1, vertexInAdyList));
        }
        return result;
    }
}
