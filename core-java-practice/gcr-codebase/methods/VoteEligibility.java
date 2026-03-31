package Methods;
import java.util.*;
public class VoteEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        
        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {

            
            ages[i] = sc.nextInt();

            boolean canVote = canStudentVote(ages[i]);

            if (canVote) {
                System.out.println("can vote.");
            } else {
                System.out.println("cannot vote.");
            }

            
        }
       
        

        
        
	}
	 public static boolean canStudentVote(int age) {
		 if (age < 0) {
	            return false;
	     }
         if (age >= 18) {
	            return true;
	     } else {
	         return false;
	     }
	       
	        
	}
}
