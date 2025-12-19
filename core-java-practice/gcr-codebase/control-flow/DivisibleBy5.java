package leetcodeBase;
import java.util.*;
public class DivisibleBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number%5==0) {
        	System.out.println(" Is the number "+number+" divisible by 5? "+"Yes");
        } 
        else {
        	System.out.println(" Is the number "+number+" divisible by 5? "+"No");
        }
	}

}
