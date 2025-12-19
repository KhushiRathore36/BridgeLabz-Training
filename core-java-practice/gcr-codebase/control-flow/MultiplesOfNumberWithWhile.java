package leetcodeBase;
import java.util.*;
public class MultiplesOfNumberWithWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int number = sc.nextInt();
		 if (number <= 0 || number >= 100) {
	            System.out.println("integer less than 100.");
	      } else {

	            
	            int counter = 100;

	            
	            while (counter > 0) {

	                if (counter % number == 0) {
	                    System.out.println(counter);
	                }

	                counter--;
	            }
	        }   
	        

	        
	        
	}

}
