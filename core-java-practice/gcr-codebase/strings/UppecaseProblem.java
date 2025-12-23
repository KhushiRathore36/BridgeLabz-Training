package Strings;
import java.util.*;
public class UppecaseProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String user_Upper = "";
		for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // ASCII conversion
            }

            user_Upper = user_Upper + ch;
        }
		String built_In_Upper = str.toUpperCase();
		boolean isSame = true;

        if (user_Upper.length() != built_In_Upper.length()) {
            isSame = false;
        } else {
            for (int i = 0; i < user_Upper.length(); i++) {
                if (user_Upper.charAt(i) != built_In_Upper.charAt(i)) {
                    isSame = false;
                    break;
                }
            }
        }
        if (isSame) {
            System.out.println("Both uppercase results are same");
        } else {
            System.out.println("Both uppercase results are different");
        }
    }

}
