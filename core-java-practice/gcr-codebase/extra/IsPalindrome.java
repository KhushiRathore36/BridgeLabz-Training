package Extras;
import java.util.*;
public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        
        if(isPalindrome(str)) {
        	System.out.println("The String "+str+" is palindrome");
        }
        else {
        	System.out.println("The String "+str+" is not a palindrome");
        }
	}
	public static boolean isPalindrome(String str) {
		int left=0;
        int right=str.length()-1;
        while(left<right) {
        	if(str.charAt(left)!=str.charAt(right)) {
        		return false;
        	}
        }
        return true;
	}

}
