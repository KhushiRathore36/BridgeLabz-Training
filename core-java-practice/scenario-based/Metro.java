package ScenarioBased;
import java.util.*;
public class Metro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

       
        double balance = sc.nextDouble();

        while (balance > 0) {

            System.out.print("Enter distance in km: ");
            int distance = sc.nextInt();

            
            if (distance == -1) {
                break;
            }

           
            int fare = (distance <= 5) ? 10 : 20;

            if (balance >= fare) {
                balance = balance - fare;
                System.out.println("Fare deducted: ₹" + fare);
                System.out.println("Remaining balance: ₹" + balance);
            } else {
                System.out.println("Insufficient balance!");
                break;
            }
        }

        System.out.println("Final balance: ₹" + balance);
	}

}
