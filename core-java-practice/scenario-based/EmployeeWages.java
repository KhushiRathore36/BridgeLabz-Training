package ScenarioBased;
import java.util.*;
public class EmployeeWages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
       
        //Use case-1 random for check the employee is present or not
//        if(attendance==1) {
//        	System.out.println("Employee is present");
//        	
//        	//use case-3 choose if the employee work as full time or part time
//        	System.out.println("write employee work (part or full");
//        	String choice=sc.nextLine();
//        	choice=choice.toLowerCase();
//        	//use case-2 print the daily wages of employee according to the working hours
//        	if(choice.equals("full")) {
//        		System.out.println("Employee daily wages are: "+dailyWages(8));
//        	}
//        	else {
//        		System.out.println("Employee daily wages are: "+dailyWages(4));
//        	}
//        	
//        }
//        else {
//        	System.out.println("Employee is absent");
//        }
        // use case-6 finding the total wages in monthly
        int maxWorkingHours=100;
        int maxdays=20;
        int totalworkingHours=0;
        int totaldays=0;
        int totaldailyAmount=0;
       //use case-4 Switch case
       while(totalworkingHours<maxWorkingHours && totaldays<maxdays) {
    	   Random random=new Random();
           int attendance=random.nextInt(2);
    	   switch(attendance) {
              case 1: {
         	      System.out.println("Employee is present");
           	
           	      //use case-3 choose if the employee work as full time or part time
           	      System.out.println("write employee work (part or full");
           	      String choice=sc.nextLine();
           	      choice=choice.toLowerCase();
           	      
           	      int dailyAmount=0;
           	      if(choice.equals("full")) {
           	    	   totalworkingHours+=8;
           		       dailyAmount=dailyWages(8);
                  }
           	      else {
           	    	 totalworkingHours+=4;
           		     dailyAmount=dailyWages(4);
           		
           	      }
           	      
           	      System.out.println("Employee daily wages are: "+dailyAmount);
           	     // System.out.println("The monthly amount of a employee are: "+monthlyWages(dailyAmount));
           	      totaldailyAmount+=dailyAmount;
       		      totaldays++;
           	      break;
               }
               case 2:
         	       System.out.println("employee is absent");
         	       break;
           }
    	   
       }
       System.out.println("The monthly amount of a employee are: "+totaldailyAmount);
        	
        
	}
	//use case-2 print the daily wages of employee according to the working hours
	public static int dailyWages(int working_hours) {
	    int wages=20;
		return working_hours*wages;
	}
	// use case-5 function for finding the total amount on the basis of monthly
	public static int monthlyWages(int dailyAmount) {
		int workingDays=20;
		return workingDays*dailyAmount;
	}

}
