package Strings;
import java.util.*;
public class FrequencyCharacters {

	public static String[][] findCharacterFrequency(String text) {

        HashMap<Character, Integer> mp = new HashMap<>();

        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (mp.containsKey(ch)) {
                mp.put(ch, mp.get(ch) + 1);
            } else {
                mp.put(ch, 1);
            }
        }

       
        String[][] str = new String[mp.size()][2];
        int index = 0;

        
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            str[index][0] = String.valueOf(entry.getKey());
            str[index][1] = String.valueOf(entry.getValue());
            index++;
        }

        return str;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String text = sc.nextLine();

        String[][] ans = findCharacterFrequency(text);

       

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i][0] + "\t\t" + ans[i][1]);
        }

        
    }

}
