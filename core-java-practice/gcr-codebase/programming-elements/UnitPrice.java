package leetcodeBase;
import java.util.*;
public class UnitPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR "+totalPrice+"  if the quantity "+quantity+"  and unit price is INR "+unitPrice);
	}

}
