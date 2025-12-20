package leetcodeBase;
import java.util.*;
public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        if (number <= 0 || power < 0) {
            System.out.println("negative number");
        } else {

            int result = 1;

            
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            
            System.out.println(result);
        }
       
        
        
        
	}

}
