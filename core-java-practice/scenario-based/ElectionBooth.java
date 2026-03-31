package ScenarioBased;
import java.util.*;
public class ElectionBooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
         int vote1 = 0;
         int vote2 = 0;
         int vote3 = 0;
         while (true) {
        	
	            int age = sc.nextInt();

	            
	            if (age == -1) {
	                break;
	            }

	            
	            if (age >= 18) {
	                System.out.println("You are eligible to vote.");
	                System.out.println("Press 1 for Candidate 1");
	                System.out.println("Press 2 for Candidate 2");
	                System.out.println("Press 3 for Candidate 3");

	                int vote = sc.nextInt();

	                if (vote == 1) {
	                    vote1++;
	                } else if (vote == 2) {
	                    vote2++;
	                } else if (vote == 3) {
	                    vote3++;
	                } else {
	                    System.out.println("Invalid vote!");
	                }

	            } else {
	                System.out.println("You are not eligible to vote.");
	            }     
	     }
	        

	        System.out.println("Result Declaration");
	        System.out.println("Candidate 1: " + vote1 + " votes");
	        System.out.println("Candidate 2: " + vote2 + " votes");
	        System.out.println("Candidate 3: " + vote3 + " votes");

	 }

}
