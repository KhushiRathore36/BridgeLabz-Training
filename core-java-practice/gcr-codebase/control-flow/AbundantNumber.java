package leetcodeBase;
import java.util.*;
public class AbundantNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
        	if (number % i == 0) {
                sum = sum + i;  
            }
           
            
        }
        if (sum > number) {
            System.out.println("The number is an Abundant Number");
        } else {
            System.out.println("The number is NOT an Abundant Number");
        }
        
        
	}

}
