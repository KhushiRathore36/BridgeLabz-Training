package Methods;
import java.util.*;
public class LeapYears {

	static boolean isLeapYear(int year) {

        // check condition whether the year is divisible by 4 and it is not divisible by 100
        boolean conditionA = (year % 4 == 0) && (year % 100 != 0);

        // check condition is divisible by 400
        boolean conditionB = (year % 400 == 0);

        // check both the condition
        return conditionA || conditionB;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("Leap Year check");
        } 
        else {
            if (isLeapYear(year)) {
                System.out.println("Leap Year");
            } 
            else {
                System.out.println("NOT a Leap Year");
            }
        }

       
    }

}
