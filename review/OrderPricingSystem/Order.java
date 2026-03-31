package OrderPricingSystem;

public abstract class Order {
    private int orderId;
    private double amount;
    Order(int orderId,double amount){
    	this.orderId=orderId;
    	this.amount=amount;
    }
    public int getOrderId() {
    	return orderId;
    }
    public double getAmount() {
    	return amount;
    }
    public abstract double getDiscountedPrice() ;
    	
    
}
