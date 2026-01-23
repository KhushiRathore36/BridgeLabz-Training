package ShoppingCart;
import java.util.*;
public class ShoppingCart {
	private Map<String, Double> priceMap = new HashMap<>();

   
    private Map<String, Integer> cartOrdered = new LinkedHashMap<>();

    public void addProduct(String product, double price) {
        priceMap.put(product, price);
    }

   
    public void addToCart(String product) {
        if (!priceMap.containsKey(product)) {
            System.out.println("Product not found: " + product);
            return;
        }
        cartOrdered.put(product, cartOrdered.getOrDefault(product, 0) + 1);
    }

   
    public Map<String, Double> getPriceMap() {
        return priceMap;
    }

    
    public Map<String, Integer> getCartOrdered() {
        return cartOrdered;
    }

    
    public Map<Double, List<String>> getItemsSortedByPrice() {
        TreeMap<Double, List<String>> sorted = new TreeMap<>();

        for (String product : cartOrdered.keySet()) {
            double price = priceMap.get(product);
            sorted.computeIfAbsent(price, p -> new ArrayList<>()).add(product);
        }

        return sorted;
    }

   
    public double getTotal() {
        double sum = 0;
        for (String product : cartOrdered.keySet()) {
            sum += priceMap.get(product) * cartOrdered.get(product);
        }
        return sum;
    }
}
