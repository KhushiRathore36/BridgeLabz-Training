package leetcodeBase;
import java.util.*;
public class InputUniversityFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int fee=sc.nextInt();
        int discountPercent=sc.nextInt();
        double discounted_amount=(fee * discountPercent)/100.0;
        int discounted_price=fee-(int)discounted_amount;
        System.out.println("The discounted amount is INR "+discounted_amount+" and final discounted fee is INR "+discounted_price);
	
	}

}
