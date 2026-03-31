package leetcodeBase;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();

        
        int sum = 0;
        int original = number;

        
        while (original != 0) {
            int digit = original % 10;

            
            sum = sum + (digit * digit * digit);

            
            original = original / 10;
            
            
        }

        
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is NOT an Armstrong Number");
        }
	}

}
