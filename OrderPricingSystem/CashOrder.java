package OrderPricingSystem;

public  class CashOrder extends Order{
	 private double totalAmount;
	 CashOrder(int orderId, double amount) {
		super(orderId, amount);
	 }
	 @Override
	 public double getDiscountedPrice()  {
		 double value=getAmount();
		 value=(value*2)/100.0;
		 totalAmount=getAmount()-value;
		 return totalAmount;
	 }
	
}
