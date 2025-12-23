package Strings;
import java.util.*;
public class LowercaseProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str_UserLower = "";
		for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            str_UserLower = str_UserLower + ch;
        }
		String str_BuiltInLower = str.toLowerCase();
		boolean isSame = true;

	    if (str_UserLower.length() != str_BuiltInLower.length()) {
	        isSame = false;
	    } else {
	        for (int i = 0; i < str_UserLower.length(); i++) {
	            if (str_UserLower.charAt(i) !=str_BuiltInLower.charAt(i)) {
	                isSame = false;
	                break;
	            }
	        }
	    }
	    if (isSame) {
            System.out.println("Both lowercase results are same");
        } else {
            System.out.println("Both lowercase results are different");
        }
    }

}
