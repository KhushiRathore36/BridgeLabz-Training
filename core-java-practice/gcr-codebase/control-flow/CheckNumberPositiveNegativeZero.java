package leetcodeBase;
import java.util.*;

public class CheckNumberPositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==0) {
        	System.out.println("Zero");
        }
        else if(num>0) {
        	System.out.println("Positive");
        }
        else {
        	System.out.println("Negative");
        }
	}

}
