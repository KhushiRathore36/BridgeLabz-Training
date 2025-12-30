package OPPSProblem;

public class CartItem {
	String itemName;
    double price;
    int quantity;

    
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    
    void addItem(int qty) {
        quantity = quantity + qty;
        System.out.println("Added " + qty + " of " + itemName + " to the cart.");
    }

    
    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity = quantity - qty;
            System.out.println("Removed " + qty + " of " + itemName + " from the cart.");
        } else {
            System.out.println("Cannot remove more items than present in cart.");
        }
    }

    
    void display() {
        double totalCost = price * quantity;
        System.out.println("Total cost: $" + totalCost);
    }

    
    void displayItem() {
        System.out.println("Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CartItem item = new CartItem("Laptop", 999.99, 1);

        item.displayItem();
        item.addItem(2);
        item.removeItem(1);
        item.display();
	}

}
