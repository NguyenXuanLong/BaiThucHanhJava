import java.util.HashMap;
import java.util.TreeMap;

public class App78 {
    public static void main(String[] agrs) {
        HashMap<Integer, Float> hashmap1 = new HashMap<>();
        HashMap<String, String> hashmap2 = new HashMap<>(10);
        HashMap<Double, Double> hashMap3 = new HashMap<>(4, 0.75f);
        HashMap<Float, Integer> hashMap4 = new HashMap<>(new TreeMap());
    }
}
