package Encapsulation;
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem implements Discountable {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }

    protected String getItemName() {
        return itemName;
    }

    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }
}

class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }

    public String getDiscountDetails() {
        return "10% discount on Veg Item";
    }
}

class NonVegItem extends FoodItem {
    private static final double NON_VEG_CHARGE = 50;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + NON_VEG_CHARGE;
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    public String getDiscountDetails() {
        return "5% discount + ₹50 non-veg charge";
    }
}

class OrderProcessor {
    public static void processOrder(FoodItem item) {
        item.getItemDetails();
        double total = item.calculateTotalPrice();
        double discount = item.applyDiscount();
        System.out.println(item.getDiscountDetails());
        System.out.println("Total Price: ₹" + total);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Payable Amount: ₹" + (total - discount));
       
    }
}
public class OnlineFoodDeliverySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodItem vegOrder = new VegItem("Paneer Butter Masala", 250, 2);
        FoodItem nonVegOrder = new NonVegItem("Chicken Biryani", 300, 1);
        OrderProcessor.processOrder(vegOrder);
        OrderProcessor.processOrder(nonVegOrder);
	}

}
