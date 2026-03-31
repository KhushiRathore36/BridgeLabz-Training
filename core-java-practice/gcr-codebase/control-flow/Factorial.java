package leetcodeBase;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int product=1;
        int i=1;
        while(i<=number) {
        	product*=i;
        	i++;
        }
        System.out.println("the factorial of a given number is "+product);
	}

}
