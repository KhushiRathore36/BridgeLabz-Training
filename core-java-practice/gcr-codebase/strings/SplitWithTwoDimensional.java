package Strings;
import java.util.*;
public class SplitWithTwoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int str_length = 0;
        try {
            while (true) {
                str.charAt(str_length);
                str_length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            
        }
        int count = 1;
        for (int i = 0; i < str_length; i++) {
            if (str.charAt(i) == ' ') {
            	 count++;
            }
        }
        int[] index = new int[ count - 1];
        int idx = 0;
        for (int i = 0; i < str_length; i++) {
            if (str.charAt(i) == ' ') {
            	index[idx++] = i;
            }
        }
        String[] words = new String[ count];
        int start = 0;
        for (int i = 0; i <  count - 1; i++) {
            words[i] = str.substring(start, index[i]);
            start = index[i] + 1;
        }
        words[ count - 1] = str.substring(start);

        
        String[][] table = new String[ count][2];

        for (int i = 0; i <  count; i++) {
            table[i][0] = words[i];

            
            int wordLen = 0;
            try {
                while (true) {
                    words[i].charAt(wordLen);
                    wordLen++;
                }
            } catch (StringIndexOutOfBoundsException e) {
               
            }

            table[i][1] = String.valueOf(wordLen);
        }
        
        for (int i = 0; i <  count; i++) {
            String word = table[i][0];
            int len = Integer.parseInt(table[i][1]); 
            System.out.println(word + "\t" + len);
        }
        

       
        

       
        

        
        
	}

}
