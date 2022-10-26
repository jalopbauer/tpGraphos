package graph;

public class Edge {
    private final int v,w;

    public Edge(int v, int w) {
        this.v = v;
        this.w = w;
    }

    public int getV() {
        return v;
    }

    public int getW() {
        return w;
    }
}
