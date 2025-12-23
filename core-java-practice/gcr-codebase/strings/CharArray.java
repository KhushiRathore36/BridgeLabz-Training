package Strings;
import java.util.*;
public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] user_Array = helper(str);
		char[] built_In_Array = str.toCharArray();
		boolean result = compareCharArrays(user_Array, built_In_Array);
		if (result) {
            System.out.println("Both character arrays are SAME");
        } else {
            System.out.println("Both character arrays are DIFFERENT");
        }
    }
	public static boolean compareCharArrays(char[] arr, char[] arr1) {
		if (arr.length != arr1.length) {
            return false;
        }

        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr1[i]) {
                return false;
            }
        }

        return true;
      
        
    }
	public static char[] helper(String str) {
        char[] charValue = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            charValue[i] = str.charAt(i);
        }

        return charValue;
    }

}
