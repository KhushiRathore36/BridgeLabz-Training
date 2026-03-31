package Strings;
import java.util.*;
public class FrequencyOfCharactersNestedLoop {

	public static String[] findFrequency(String text) {
        char[] ch = text.toCharArray(); 
        int n = ch.length;
        int[] freq = new int[n]; 

        
        for (int i = 0; i < n; i++) {
            if (ch[i] == '0') {
                continue; 
            }
            freq[i] = 1;

            
            for (int j = i + 1; j < n; j++) {
                if (ch[i] == ch[j]) {
                    freq[i]++; 
                    ch[j] = '0';
                }
            }
        }

        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (ch[i] != '0') {
                count++;
            }
        }

        
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (ch[i] != '0') {
                result[index] = ch[i] + " = " + freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        
        String text = sc.nextLine();

       
        String[] frequency = findFrequency(text);

        
        for (String s : frequency) {
            System.out.println(s);
        }

       
    }

}
