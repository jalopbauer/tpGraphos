package graph;

import java.util.*;

public class DirectedGraph<T> implements Graph<T> {

    private final HashMap<T, List<T>> vertexesAdyList;
    private int alpha;

    public DirectedGraph() {
        this.vertexesAdyList = new HashMap<>();
    }

    @Override
    public void addVertex(T vertex) {
        if (!existsVertex(vertex))
            vertexesAdyList.put(vertex, new ArrayList<>());
    }

    @Override
    public void deleteVertex(T vertex) {
        vertexesAdyList.remove(vertex);
        for (T t : vertexesAdyList.keySet())
            deleteEdge(new Edge<>(t,vertex));
    }

    @Override
    public void addEdge(Edge<T> edge) {
        if (existsVertex(edge.getFromVertex()) && existsVertex(edge.getToVertex())) {
            List<T> adyListForVertex = getAdyListForVertex(edge.getFromVertex());
            adyListForVertex.add(edge.getToVertex());
            ++alpha;
        }
    }

    @Override
    public void deleteEdge(Edge<T> edge) {
        if (existsEdge(edge)) {
            List<T> adyListForVertex = getAdyListForVertex(edge.getFromVertex());
            adyListForVertex.remove(edge.getToVertex());
            --alpha;
        }
    }

    @Override
    public boolean existsEdge(Edge<T> edge) {
        if (!existsVertex(edge.getFromVertex()))
            return false;
        return vertexesAdyList.get(edge.getFromVertex()).contains(edge.getToVertex());
    }

    @Override
    public boolean existsVertex(T vertex) {
        return vertexesAdyList.containsKey(vertex);
    }

    @Override
    public int order() {
        return vertexesAdyList.size();
    }

    @Override
    public int alpha() {
        return alpha;
    }

    @Override
    public Set<T> getVertexes() {
        return vertexesAdyList.keySet();
    }

    @Override
    public List<T> getAdyListForVertex(T v) {
        return vertexesAdyList.get(v);
    }
}
