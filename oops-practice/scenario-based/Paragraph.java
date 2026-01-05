package ScenarioBased;
import java.util.*;
public class Paragraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter paragraph:");
        String para = sc.nextLine();

        System.out.println("Enter word to replace:");
        String oldWord = sc.nextLine();

        System.out.println("Enter replacement word:");
        String newWord = sc.nextLine();

        analyzePara(para, oldWord, newWord);
	}
	public static void analyzePara(String para, String oldWord, String newWord) {

        
        if (para == null || para.trim().isEmpty()) {
            System.out.println("Paragraph is empty or contains only spaces.");
            return;
        }

        
        para= para.trim().replaceAll("\\s+", " ");

        
        String[] words = para.split(" ");

       
        int wordCount = words.length;

       
        String longestWord = words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        
        String replacedParagraph =
                para.replaceAll("(?i)\\b" + oldWord + "\\b", newWord);

        
        System.out.println("Word Count: " + wordCount);
        System.out.println("Longest Word: " + longestWord);
        System.out.println("Updated Paragraph:");
        System.out.println(replacedParagraph);
    }
}
