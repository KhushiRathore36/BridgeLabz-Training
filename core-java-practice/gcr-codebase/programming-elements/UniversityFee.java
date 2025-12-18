package leetcodeBase;

public class UniversityFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int fee=125000;
        int discountPercent=10;
        double discounted_amount=(fee * discountPercent)/100.0;
        int discounted_price=fee-(int)discounted_amount;
        System.out.println("The discounted amount is INR "+discounted_amount+" and final discounted fee is INR "+discounted_price);
	}

}
