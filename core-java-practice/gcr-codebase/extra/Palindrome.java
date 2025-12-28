package Extras;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        String input = sc.next();           
        boolean result = isPalindrome(input); 
        if(result) {
        	System.out.println("The word is palindrome");
        }
        else {
        	System.out.println("Not a palindrome");
        }
	}
	public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
