package Strings;
import java.util.*;
public class IllegalArgumentExceptionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 String str = sc.next();
		 try {
	          System.out.println(str.substring(5, 2));
	     } 
	     catch (IllegalArgumentException e) {
	         System.out.println("IllegalArgumentException caught");
	         System.out.println("Start index cannot be greater than end index");
	      } 
	      catch (RuntimeException e) {
	          System.out.println("RuntimeException caught");
	      }    
	       

	}

}
