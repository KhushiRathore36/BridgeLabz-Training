package leetcodeBase;
import java.util.*;
public class YoungestFreinds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int amarAge = sc.nextInt();
		int akbarAge = sc.nextInt();
		int anthonyAge = sc.nextInt();
		double amarHeight = sc.nextDouble();
		double akbarHeight = sc.nextDouble();
	    double anthonyHeight = sc.nextDouble();
		if (amarAge < akbarAge && amarAge < anthonyAge) {
	        System.out.println("Amar is the youngest friend.");
	    } 
	    else if (akbarAge < amarAge && akbarAge < anthonyAge) {
	         System.out.println("Akbar is the youngest friend.");
	    } 
	    else {
	         System.out.println("Anthony is the youngest friend.");
	    }
		if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Amar is the tallest friend.");
        } 
        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("Akbar is the tallest friend.");
        } 
        else {
            System.out.println("Anthony is the tallest friend.");
        }
		 
	        
        
       

        
        
        

       
	}

}
