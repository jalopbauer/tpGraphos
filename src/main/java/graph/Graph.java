package graph;

import java.util.List;
import java.util.Set;

public interface Graph<T> {
    void addVertex(T x);
    void addEdge(Edge<T> edge);
    void deleteEdge(Edge<T> edge);
    void deleteVertex(T v);
    boolean existsEdge(Edge<T> edge);
    boolean existsVertex(T edge);
    int order();
    int alpha();
    Set<T> getVertexes();
    List<T> getAdyListForVertex(T v);
}