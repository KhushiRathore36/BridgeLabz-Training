package leetcodeBase;
import java.util.*;
public class IsFirstSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1<num2 && num1<num3) {
        	System.out.println("Is the first number the smallest? Yes");
        }
        else {
        	System.out.println("Is the first number the smallest? No");
        }
	}

}
