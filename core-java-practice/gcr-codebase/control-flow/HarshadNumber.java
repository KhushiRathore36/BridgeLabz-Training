package leetcodeBase;
import java.util.*;
public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int original = number;
        while (original != 0) {
        int digit = original % 10;
            sum = sum + digit;
            original = original / 10;
        }
        if (number % sum == 0) {
            System.out.println(" Is a Harshad Number");
        } else {
            System.out.println(" Is NOT a Harshad Number");
        }

        
        

	}

}
