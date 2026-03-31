package leetcodeBase;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        String isNum1Largest="No";
        String isNum2Largest="No";
        String isNum3Largest="No";
        if(num1>num2 && num1>num3) {
        	isNum1Largest="Yes";
        }
        else if(num2>num1 && num2>num3) {
        	isNum2Largest="Yes";
        }
        else {
        	isNum3Largest="Yes";
        }
        System.out.println("Is the first number the largest? "+isNum1Largest);
        System.out.println("Is the second number the largest? "+isNum2Largest);
        System.out.println("Is the third number the largest? "+isNum3Largest);
	}
}
