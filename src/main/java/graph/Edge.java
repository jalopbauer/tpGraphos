package graph;

import java.util.Objects;

public class Edge<T> {
    private final T fromVertex, toVertex;

    public Edge(T fromVertex, T toVertex) {
        this.fromVertex = fromVertex;
        this.toVertex = toVertex;
    }

    public T getFromVertex() {
        return fromVertex;
    }

    public T getToVertex() {
        return toVertex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Edge)) return false;
        Edge<?> edge = (Edge<?>) o;
        return getFromVertex().equals(edge.getFromVertex()) && getToVertex().equals(edge.getToVertex());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFromVertex(), getToVertex());
    }
}
