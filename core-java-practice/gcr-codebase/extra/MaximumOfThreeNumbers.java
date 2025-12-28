package Extras;
import java.util.*;
public class MaximumOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println(maximumNumber(num1,num2,num3));
	}
	public static int maximumNumber(int num1,int num2,int num3) {
		if(num1>num2 && num1>num3) {
			return num1;
		}
		else if(num2>num3 && num2>num3) {
			return num2;
		}
		return num3;
	}

}
