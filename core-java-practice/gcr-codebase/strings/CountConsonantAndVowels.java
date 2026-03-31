package Strings;
import java.util.*;
public class CountConsonantAndVowels {

	public static String isCharacter(char ch) {
		if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
        	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";

    }
	public static int[] vowelAndConsonant(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            String ans = isCharacter(ch);

            if (ans.equals("Vowel")) {
                vowelCount++;
            } else if (ans.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] result = vowelAndConsonant(input);

        System.out.println("No. of Vowels: " + result[0]);
        System.out.println("No. of Consonants: " + result[1]);

        
    }
    

   
    

}
