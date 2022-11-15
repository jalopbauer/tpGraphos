package application;

import graph.Edge;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ConstructorTest {
    String[] vertexes = {"A", "B", "C", "D", "E"};
    Edge<String> ab = new Edge<>("A", "B");
    Edge<String> ac = new Edge<>("A", "C");
    List<Edge<String>> edges = Arrays.asList(ab,ac);
    boolean[][] warshallMatrixForTest = {{true,true,true},{false,false,false},{false,false,false}};
    @Test
    public void persistsEdges(){
    TransportNet<String> transportNet = new TransportNet<>(edges);
    assertEquals(edges, transportNet.getEdges());
    }

    @Test
    public void createsWarshallMatrix(){
        TransportNet<String> transportNet = new TransportNet<>(edges);
        assertEquals(warshallMatrixForTest, transportNet.getWarshalMatrix()); // La matriz me da true solo en si mismo
    }

}
