package ScenarioBased;
import java.util.*;
public class BusRouteTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int total= 0;
        int stop = 2;   
        String choice;

        while (true) {

            total = total + stop;
           
            System.out.println(total );

            System.out.print("Do you want to get off? (yes/no): ");
            choice = sc.next();

            if (choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Passenger got off");
        System.out.println("Total distance travelled: " + total + " km");
	}

}
