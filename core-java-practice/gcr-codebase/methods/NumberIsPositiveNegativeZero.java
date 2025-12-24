package Methods;
import java.util.*;
public class NumberIsPositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        checkNumber(number);
	}
	public static void checkNumber(int number) {
		if(number>0) {
			System.out.println("number is positive");
		}
		else if(number==0) {
			System.out.println("number is zero");
		}
		else {
			System.out.println("number is negative");
		}
	}

}
