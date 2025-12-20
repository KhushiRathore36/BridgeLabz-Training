package leetcodeBase;
import java.util.*;
public class BonusEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int yearsOfService = sc.nextInt();

        
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;   
            System.out.println("The bonus amount is "+bonus);
        } else {
            System.out.println("No bonus");
        }

        
        
	}

}
