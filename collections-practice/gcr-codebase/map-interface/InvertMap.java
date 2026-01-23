package MapInterface;
import java.util.*;
public class InvertMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> original = new HashMap<>();
        original.put("A", 1);
        original.put("B", 2);
        original.put("C", 1);

        System.out.println(invert(original));
	}
	public static <K, V> Map<V, List<K>> invert(Map<K, V> original) {
        Map<V, List<K>> inverted = new HashMap<>();

        for (Map.Entry<K, V> entry : original.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            inverted.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        return inverted;
    }
}
