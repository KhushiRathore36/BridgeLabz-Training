package leetcodeBase;
import java.util.*;
public class LeapYearWithAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        
        int year = sc.nextInt();

        if (year >= 1582 && 
           ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {

            System.out.println("Leap Year");
        } 
        else if (year >= 1582) {
            System.out.println("not a Leap Year");
        } 
        else {
            System.out.println(" corresponding to a year in the Gregorian calendar");
        }
	}

}
