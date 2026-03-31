package OrderPricingSystem;

public class CreditCardOrder extends Order{
	 private double totalAmount;
	 CreditCardOrder(int orderId, double amount) {
		super(orderId, amount);
	 }
	 @Override
	 public double getDiscountedPrice()  {
		 double value=getAmount();
		 value=(value*5)/100.0;
		 totalAmount=getAmount()-value;
		 return totalAmount;
	 }
}
