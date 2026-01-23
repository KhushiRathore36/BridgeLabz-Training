package Collections;
import java.util.*;
public class FreqCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> input = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println(countFrequency(input));
	}
	public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> freqMap = new HashMap<>();

        for (String item : list) {
            
            freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
        }

        return freqMap;
    }
}
