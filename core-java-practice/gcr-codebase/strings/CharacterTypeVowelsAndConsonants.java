package Strings;
import java.util.*;
public class CharacterTypeVowelsAndConsonants {

	public static String checkCharacter(char ch) {
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

    
    public static String[][] characterTypes(String str) {

        String[][] result = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacter(ch);
        }

        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[][] result = characterTypes(str);
        
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }

        
    }
  
    

   
    

}
