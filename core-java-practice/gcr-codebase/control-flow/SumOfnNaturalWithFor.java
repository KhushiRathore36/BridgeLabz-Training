package leetcodeBase;

import java.util.Scanner;

public class SumOfnNaturalWithFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        if(number>0) {
            // print the sum using for loop
            int sum=0;
            for(int i=number;i>=1;i--) {
            	sum=sum+i;
            }

            // Compute sum using formula
            int sumFormula = number * (number+ 1) / 2;

            //  Compare results
            System.out.println("Sum using while loop = " + sum);
            System.out.println("Sum using formula = " + sumFormula);

            if (sum == sumFormula) {
                System.out.println("Both are same");
            } else {
                System.out.println("Both are not same");
            }
        }
	}

}
