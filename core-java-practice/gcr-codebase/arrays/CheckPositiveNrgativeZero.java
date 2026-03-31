package Arrays;

import java.util.Scanner;

public class CheckPositiveNrgativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number[]=new int[5];
		for(int i=0;i<5;i++) {
			number[i]=sc.nextInt();
			
		}
		for(int i=0;i<5;i++) {
			if(number[i]==0) {
				System.out.println("Zero");
			}
			else if(number[i]>0) {
				if(number[i]%2==0) {
					System.out.println("even");
				}
				else {
					System.out.println("Odd");
				}
			}
			else {
				System.out.println("Negative");
			}
		}
		if(number[0]==number[4]) {
			System.out.println("Equal");
		}
		else if(number[0]>number[4]) {
			System.out.println("first number is greater");
		}
		else {
			System.out.println("first number is less");
		}
	}

}
