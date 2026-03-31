package Strings;
import java.util.*;
public class FrequencyCharacterWithUserDefined {

	public static char[] uniqueCharacters(String text) {

        int length = text.length();
        char[] temp = new char[length];
        int count = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[count] = current;
                count++;
            }
        }

        
        char[] uniqueChars = new char[count];
        for (int i = 0; i < count; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    
    public static String[][] characterFrequency(String text) {

        HashMap<Character, Integer> mp = new HashMap<>();

        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        
        char[] uniqueChar = uniqueCharacters(text);

        
        String[][] result = new String[uniqueChar.length][2];

        for (int i = 0; i < uniqueChar.length; i++) {
            result[i][0] = String.valueOf(uniqueChar[i]);
            result[i][1] = String.valueOf(mp.get(uniqueChar[i]));
        }

        return result;
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        String text = sc.nextLine();

        String[][] ans = characterFrequency(text);

       

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i][0] + "\t\t" + ans[i][1]);
        }

       
    }

}
