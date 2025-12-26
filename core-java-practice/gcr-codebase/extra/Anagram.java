package Extras;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

       
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

       
        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
           
        }

        else {
        	int count = 0;

            
            for (int i = 0; i < str1.length(); i++) {
                count = 0;
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    System.out.println("Not anagrams");
                    return;
                }
            }

            System.out.println("Anagrams");
        }
       
    
	}

}
