package Strings;
import java.util.*;
public class LeadingAndTrailingSpace {

	public static int[] trimIndexes(String str) {

        int start = 0;
        int end = str.length() - 1;
        int ans[]=new int[2];

        
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

       
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    
    public static String createSubstring(String str, int start, int end) {

        String ans = "";

        for (int i = start; i <= end; i++) {
            ans=ans + str.charAt(i);
        }

        return ans;
    }

   
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        String input = sc.nextLine();

       
        int[] indexes = trimIndexes(input);
        String trimmed = createSubstring(input, indexes[0], indexes[1]);

       
        String built_In_Trimmed = input.trim();

       
        boolean isSame = compareStrings(trimmed, built_In_Trimmed);

        
        System.out.println(trimmed);
        System.out.println(built_In_Trimmed);
        System.out.println("Are both strings equal or not " + isSame);

       
    }

}
