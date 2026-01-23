package ShoppingCart;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart cart = new ShoppingCart();

        
        cart.addProduct("Apple", 50);
        cart.addProduct("Banana", 10);
        cart.addProduct("Milk", 40);
        cart.addProduct("Bread", 30);

       
        cart.addToCart("Milk");
        cart.addToCart("Apple");
        cart.addToCart("Banana");
        cart.addToCart("Apple");

        System.out.println("=== HashMap: Price Catalog ===");
        System.out.println(cart.getPriceMap());

        System.out.println("\n=== LinkedHashMap: Cart Order ===");
        System.out.println(cart.getCartOrdered());

        System.out.println("\n=== TreeMap: Items Sorted by Price ===");
        System.out.println(cart.getItemsSortedByPrice());

        System.out.println("\n=== Total Bill ===");
        System.out.println(cart.getTotal());
	}

}
