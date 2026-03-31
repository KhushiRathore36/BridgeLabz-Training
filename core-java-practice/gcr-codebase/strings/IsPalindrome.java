package Strings;
import java.util.*;
public class IsPalindrome {

	 public static boolean isPalindromeIterative(String text) {
	        int start = 0;
	        int end = text.length() - 1;

	        while (start < end) {
	            if (text.charAt(start) != text.charAt(end)) {
	                return false;
	            }
	            start++;
	            end--;
	        }
	        return true;
	    }

	    
	    public static boolean isPalindromeRecursive(String text, int start, int end) {
	        if (start >= end) {
	            return true;
	        }
	        if (text.charAt(start) != text.charAt(end)) {
	            return false;
	        }
	        return isPalindromeRecursive(text, start + 1, end - 1);
	    }

	    
	    public static boolean isPalindromeUsingCharArray(String text) {
	        char[] original = text.toCharArray();
	        char[] reverse = new char[original.length];

	       
	        for (int i = 0; i < original.length; i++) {
	            reverse[i] = original[original.length - 1 - i];
	        }

	        
	        for (int i = 0; i < original.length; i++) {
	            if (original[i] != reverse[i]) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	       
	        String text = sc.nextLine();

	       
	        boolean result = isPalindromeIterative(text);
	        System.out.println("Palindrome check (Iterative): " + result);

	        
	        boolean resultRecurse= isPalindromeRecursive(text, 0, text.length() - 1);
	        System.out.println("Palindrome check (Recursive): " + resultRecurse);

	       
	        boolean resultCharArray = isPalindromeUsingCharArray(text);
	        System.out.println("Palindrome check (Char Array): " + resultCharArray);

	       
	    }

}
