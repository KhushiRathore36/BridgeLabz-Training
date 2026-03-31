package Extras;
import java.util.*;
public class ToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

           
            if (ch >= 'A' && ch <= 'Z') {
                temp = temp + (char)(ch + 32);
            }
           
            else if (ch >= 'a' && ch <= 'z') {
                temp = temp + (char)(ch - 32);
            }
            
            else {
                temp= temp + ch;
            }
        }

        
        System.out.println("Toggled string: " + temp);

    }

}
