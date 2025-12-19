package leetcodeBase;
import java.util.*;
public class SumOfNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double number=sc.nextDouble();
        while (number != 0) {
            total = total + number;   
            number = sc.nextDouble();
        }
        System.out.println("Total sum = " + total);
	}
}
