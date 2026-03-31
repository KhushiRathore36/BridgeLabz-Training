package leetcodeBase;
import java.util.*;
public class FactorsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number <= 0) {
            System.out.println("It is a negative integer.");
        } else {

            System.out.println("Factors of " + number + " are:");

            
            for (int i = 1; i <= number; i++) {

                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
        
        

       
        
	}

}
