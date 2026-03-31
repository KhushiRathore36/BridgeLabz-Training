package ScenarioBased;
import java.util.*;
public class Cafetaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        
        String[] menu = {
            "Veg Sandwich",
            "Cheese Burger",
            "Pasta",
            "Pizza Slice",
            "French Fries",
            "Veg Momos",
            "Cold Coffee",
            "Tea",
            "Chocolate Shake",
            "Fruit Salad"
        };

        
        displayMenu(menu);

        System.out.print("\nEnter item index to order: ");
        int choice = sc.nextInt();

      
        System.out.println(getItemByIndex(menu, choice));
	}
	public static void displayMenu(String[] menu) {
        
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

   
    public static String getItemByIndex(String[] menu, int index) {
        if (index < 0 || index >= menu.length) {
            return "Invalid selection. Please choose a valid index.";
        }
        return "You selected: " + menu[index];
    }
}
