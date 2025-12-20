package leetcodeBase;
import java.util.*;
public class SumOfNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        if(number>0) {
            // print the sum using while loop
            int sumWhile = 0;
            int i = 1;
            while (i <= number) {
                sumWhile = sumWhile + i;
                i++;
            }

            // Compute sum using formula
            int sumFormula = number * (number+ 1) / 2;

            //  Compare results
            System.out.println("Sum using while loop = " + sumWhile);
            System.out.println("Sum using formula = " + sumFormula);

            if (sumWhile == sumFormula) {
                System.out.println("Both are same");
            } else {
                System.out.println("Both are not same");
            }
        }
	}

}
