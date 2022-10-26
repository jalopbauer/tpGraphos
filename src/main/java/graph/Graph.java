package graph;

import java.util.List;

public interface Graph<T> {
    int addVertex(T x);
    void addEdge(Edge edge);
    void deleteEdge(Edge edge);
    void deleteVertex(int v);
    boolean existsEdge(Edge edge);
    int order();
    int alpha();
    T getVertex(int v);
    List<T> getAdyListForVertex(int v);
}