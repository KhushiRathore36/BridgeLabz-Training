package Strings;
import java.util.*;
public class ShortestAndLongest {

	public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
           
        }
        return count;
    }

   
    public static String[] splitTextManually(String text) {
        int length = findLength(text);

        
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        
        int[] spaceIndex = new int[wordCount - 1];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }

        
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount - 1; i++) {
            words[i] = text.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }
        words[wordCount - 1] = text.substring(start);

        return words;
    }

    
    public static String[][] wordsWithLengths(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        return table;
    }

   
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = splitTextManually(str);
        String[][] table = wordsWithLengths(words);
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
        String[] ans = findShortestLongest(table);

        System.out.println("Shortest word: " + ans[0]);
        System.out.println("Longest word: " + ans[1]);
    }
    public static String[] findShortestLongest(String[][] table) {
        int minLen = Integer.parseInt(table[0][1]);
        int maxLen = Integer.parseInt(table[0][1]);
        String shortest = table[0][0];
        String longest = table[0][0];

        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < minLen) {
                minLen = len;
                shortest = table[i][0];
            }
            if (len > maxLen) {
                maxLen = len;
                longest = table[i][0];
            }
        }

        return new String[]{shortest, longest};
    }
}
