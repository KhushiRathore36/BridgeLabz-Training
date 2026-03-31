package Strings;
import java.util.*;
public class UniqueCharacters {

	public static HashMap<Character, Integer> uniqueCharacters(String text) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (mp.containsKey(ch)) {
                mp.put(ch, mp.get(ch) + 1);
            } else {
                mp.put(ch, 1);
            }
        }
        return mp;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        HashMap<Character, Integer> result = uniqueCharacters(text);

        
        for (Map.Entry<Character, Integer> sample : result.entrySet()) {
            if (sample.getValue() == 1) {
                System.out.print(sample.getKey() + " ");
            }
        }

       
    }

}
