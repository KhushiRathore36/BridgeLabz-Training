package Strings;
import java.util.*;
public class NumberFormatProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		try {
            
            int num = Integer.parseInt(str);
            System.out.println("Number is: " + num);
        } 
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
            System.out.println("Input string does not contain a number");
        } 
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
        
	}

}
