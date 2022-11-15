package graph.methods;

import graph.Graph;

import java.util.ArrayList;
import java.util.List;

public class Warshall<T> {

    public boolean[][] warshallize(Graph<T> graph){
        boolean[][] adyMatrix =  new boolean[graph.order()][graph.order()];
        List<T> vertexes = new ArrayList<>(graph.getVertexes());
        populate(graph, adyMatrix);
        for (int k = 0; k < vertexes.size(); k++) {
            for (int i = 0; i < vertexes.size(); i++) {
                for (int j = 0; j < vertexes.size(); j++) {
                    if (adyMatrix[i][k] && adyMatrix[k][j])
                        adyMatrix[i][j] = true;
                }
            }
        }
        return adyMatrix;
    }

    private void populate(Graph<T> graph, boolean[][] adyMatrix) {
        List<T> vertexes = new ArrayList<>(graph.getVertexes());
        for (T vertex : vertexes) {
            List<T> adyListForVertex = graph.getAdyListForVertex(vertex);
            int index = vertexes.indexOf(vertex);
            for (T adyVertex : adyListForVertex) {
                int adyIndex = vertexes.indexOf(vertex);
                adyMatrix[index][adyIndex] = true;
            }
        }
    }
}
