package MapInterface;
import java.io.*;
import java.util.*;
public class WordFrequencyCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String filePath = "input.txt";  
        Map<String, Integer> wordCountMap = new HashMap<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                
                line = line.toLowerCase().replaceAll("[^a-z0-9 ]", " ");
                
                String[] words = line.split("\\s+");
                
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
            
            System.out.println(wordCountMap);
            
        } catch (IOException e) {
            System.out.println("File Read Error: " + e.getMessage());
        }
	}

}
