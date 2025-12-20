package leetcodeBase;
import java.util.*;
public class PrintOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number>0) {
        	for(int i=1;i<=number;i++) {
        		if(i%2==0) {
        			System.out.println("The number is even");
        		}
        		else {
        			System.out.println("The number is odd");
        		}
        	}
        }
	}

}
