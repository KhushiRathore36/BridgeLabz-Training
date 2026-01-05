package ScenarioBased;
import java.util.*;
public class SentenceFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input =sc.nextLine();
        System.out.println(formatPara(input));
	}
	public static String formatPara(String paragraph) {

        if (paragraph == null || paragraph.trim().isEmpty()) {
            return paragraph;
        }

       
        paragraph = paragraph.trim();

        
        paragraph = paragraph.replaceAll("\\s+", " ");

        
        paragraph = paragraph.replaceAll("\\s*([.!?])\\s*", "$1 ");

       
        paragraph = paragraph.substring(0, 1).toUpperCase() + paragraph.substring(1);

        
        StringBuilder result = new StringBuilder(paragraph);
        for (int i = 0; i < result.length() - 1; i++) {
            if (result.charAt(i) == '.' || result.charAt(i) == '?' || result.charAt(i) == '!') {
                if (i + 2 < result.length()) {
                    result.setCharAt(i + 2, Character.toUpperCase(result.charAt(i + 2)));
                }
            }
        }

        return result.toString().trim();
    }
}
