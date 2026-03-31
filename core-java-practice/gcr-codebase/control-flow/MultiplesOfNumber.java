package leetcodeBase;
import java.util.*;
public class MultiplesOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Number is less than 100");
        } else {
            
            for (int i = 100; i >= 1; i--) {

                
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
	}

}
