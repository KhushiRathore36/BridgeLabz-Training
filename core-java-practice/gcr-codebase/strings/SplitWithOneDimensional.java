package Strings;
import java.util.*;
public class SplitWithOneDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            
        }
        int count = 1;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
            	count++;
            }
        }
        int[] index = new int[count - 1];
        int idx = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
            	index[idx++] = i;
            }
        }
        String[] words = new String[count];
        int start = 0;

        for (int i = 0; i < count - 1; i++) {
        	words[i] = str.substring(start, index[i]);
            start = index[i] + 1;
        }
        words[count - 1] = str.substring(start);

        String[] built_In_Words = str.split(" ");

       
        boolean isSame = true;

        if (words.length != built_In_Words.length) {
            isSame = false;
        } else {
            for (int i = 0; i < words.length; i++) {
                if (!words[i].equals(built_In_Words[i])) {
                    isSame = false;
                    break;
                }
            }
        }
        if (isSame) {
            System.out.println("Both word arrays are SAME");
        } else {
            System.out.println("Both word arrays are DIFFERENT");
        }

       
       

       
        

        
        

      
        
	}

}
