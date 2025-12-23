package Strings;
import java.util.*;
public class ArrayIndexOutOfBoundProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names_User = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names_User[i] = sc.next();
        }
        try {
            
            System.out.println(names_User[names_User.length]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
            System.out.println("Invalid index");
        } 
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
        
	}

}
