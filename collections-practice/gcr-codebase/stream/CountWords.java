package Stream;
import java.io.*;
import java.util.*;
public class CountWords {
	public static void main(String[] args) {
        String filename = "input.txt";

        Map<String, Integer> wordCount = new HashMap<>();
        int totalWords = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                
                String[] words = line.toLowerCase().split("[^a-z0-9]+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                        totalWords++;
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }

        
        List<Map.Entry<String, Integer>> sortedList =
            new ArrayList<>(wordCount.entrySet());

        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("Total Words: " + totalWords);
        System.out.println("\nTop 5 Most Frequent Words:");

        for (int i = 0; i < Math.min(5, sortedList.size()); i++) {
            Map.Entry<String, Integer> entry = sortedList.get(i);
            System.out.println((i + 1) + ". " + entry.getKey() + " → " + entry.getValue());
        }
    }
}
