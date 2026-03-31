package OrderPricingSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Order cashOrder=new CashOrder(101,100.0);
        System.out.println("The amount is: "+cashOrder.getAmount());
        System.out.println("The amount after discount is: "+cashOrder.getDiscountedPrice());
        Order creditOrder=new CreditCardOrder(102,200.0);
        
        System.out.println("The amount is: "+creditOrder.getAmount());
        System.out.println("The amount after discount is: "+creditOrder.getDiscountedPrice());
	}

}
