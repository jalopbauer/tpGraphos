package application;
import graph.Edge;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class ConstantWarshallTest {
    Edge<String> ab = new Edge<>("A", "B");
    Edge<String> ac = new Edge<>("A", "C");
    List<Edge<String>> edges = Arrays.asList(ab,ac);
    public static Map<String, HashMap<String, Boolean>> correctWarshall;
    public static HashMap<String, Boolean> aMap;
    public static HashMap<String, Boolean> bMap;
    public static HashMap<String, Boolean> cMap;
    static {
        correctWarshall = new HashMap<>();
        aMap = new HashMap<>();
        bMap = new HashMap<>();
        cMap = new HashMap<>();
        aMap.put("A", false);
        aMap.put("B", true);
        aMap.put("C", true);
        bMap.put("A", false);
        bMap.put("B", false);
        bMap.put("C", false);
        cMap.put("A", false);
        cMap.put("B", false);
        cMap.put("C", false);
        correctWarshall.put("A", aMap);
        correctWarshall.put("B", bMap);
        correctWarshall.put("C", cMap);

    }
    @Test
    public void constantWarshallPersists(){
        TransportNet<String> transportNet = new TransportNet<>(edges);
        assertEquals(correctWarshall, transportNet.getConstantWarshalMatrix());

    }
}
