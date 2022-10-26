package graph;

import java.util.List;

public class DirectedGraph<T> implements Graph<T>{
    @Override
    public int addVertex(T x) {
        return 0;
    }

    @Override
    public void addEdge(Edge edge) {

    }

    @Override
    public void deleteEdge(Edge edge) {

    }

    @Override
    public void deleteVertex(int v) {

    }

    @Override
    public boolean existsEdge(Edge edge) {
        return false;
    }

    @Override
    public int order() {
        return 0;
    }

    @Override
    public int alpha() {
        return 0;
    }

    @Override
    public T getVertex(int v) {
        return null;
    }

    @Override
    public List<T> getAdyListForVertex(int v) {
        return null;
    }
}
