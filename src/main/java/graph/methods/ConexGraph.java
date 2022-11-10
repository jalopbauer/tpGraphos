package graph.methods;

import graph.Graph;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConexGraph<T> {

    public Set<T> find(Graph<T> graph){
        return null;
    }

    public boolean isConected(Graph<T> graph){
        Set<T> vertexes = new java.util.HashSet<>(Set.copyOf(graph.getVertexes()));
        for(T vertex : vertexes){
            Set<T> visited = new HashSet<>();
            DFS(graph, vertex, visited);
            if(visited.size() != graph.order()) return false;
        }
        return true;
    }

    void DFS(Graph<T> graph, T vertex, Set<T> visited) {
        visited.add(vertex);
        List<T> adyListForVertex = graph.getAdyListForVertex(vertex);
        for (T vertexInAdyList : adyListForVertex) {
            if (!visited.contains(vertexInAdyList)) DFS(graph, vertexInAdyList, visited);
        }
    }
}
