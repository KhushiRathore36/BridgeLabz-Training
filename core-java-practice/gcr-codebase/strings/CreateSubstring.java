package Strings;
import java.util.*;
public class CreateSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String substring1 = createSubstringUsingCharAt(text, start, end);
        String substring2 = text.substring(start, end);
        boolean isSame = compareStringsUsingCharAt(substring1, substring2);
        if (isSame) {
            System.out.println("Both substrings are same");
        } else {
            System.out.println("Both substrings are different");
        }
    }
	public static String createSubstringUsingCharAt(String text, int start, int end) {
        String str = "";

        for (int i = start; i < end; i++) {
            str = str + text.charAt(i);
        }

        return str;
    }
	public static boolean compareStringsUsingCharAt(String sample1, String sample2) {

        
        if (sample1.length() != sample2.length()) {
            return false;
        }

        
        for (int i = 0; i < sample1.length(); i++) {
            if (sample1.charAt(i) != sample2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
	

}
