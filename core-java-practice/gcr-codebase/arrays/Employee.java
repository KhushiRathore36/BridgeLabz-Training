package Arrays;
import java.util.*;
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 double[] salary = new double[10];
	     double[] years = new double[10];
	     double[] bonus = new double[10];
	     double[] newSalary = new double[10];
	     double totalBonus = 0.0;
	     double totalOldSalary = 0.0;
	     double totalNewSalary = 0.0;
	     for (int i = 0; i < 10; i++) {
	         double sal = sc.nextDouble();
             double years1 = sc.nextDouble();
              if (sal <= 0 || years1 < 0) {
            	  System.out.println("Invalid input");
	                i--; 
	                continue;
	          }

	          salary[i] = sal;
	          years[i] = years1;
	     }   
	     for (int i = 0; i < 10; i++) {
	            double sal = sc.nextDouble();

	            
	            double years1 = sc.nextDouble();

	            
	            if (sal <= 0 || years1 < 0) {
	                System.out.println("Invalid input");
	                i--; 
	                continue;
	            }

	            salary[i] = sal;
	            years[i] = years1;
	      }   
	     for (int i = 0; i < 10; i++) {

	            if (years[i] > 5) {
	                bonus[i] = salary[i] * 0.05; 
	            } else {
	                bonus[i] = salary[i] * 0.02; 
	            }

	            newSalary[i] = salary[i] + bonus[i];

	            
	            totalBonus += bonus[i];
	            totalOldSalary += salary[i];
	            totalNewSalary += newSalary[i];
	      }  
	        
	     System.out.println(totalOldSalary);
	     System.out.println(totalBonus);
	     System.out.println(totalNewSalary);
	        
	        

	        
	        

	       
	        
	        

	}

}
