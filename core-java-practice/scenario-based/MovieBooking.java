package ScenarioBased;
import java.util.*;
public class MovieBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        char customers = 'y';
        while (customers == 'y' || customers == 'Y') {

            int totalBill = 0;

           

            

           
            System.out.println("Select Seat Type (gold/silver):");
            String seatType = sc.next();

            
            if (seatType.equalsIgnoreCase("gold")) {
                totalBill += 100;
            } else if (seatType.equalsIgnoreCase("silver")) {
                totalBill += 50;
            } else {
                System.out.println("Invalid seat type!");
                continue;
            }

            
            System.out.println("Do you want snacks? (yes/no):");
            String snacksChoice = sc.next();

            if (snacksChoice.equalsIgnoreCase("yes")) {
                totalBill += 80;
            }

          
            System.out.println("Total Ticket Price: ₹" + totalBill);

            
            
            customers = sc.next().charAt(0);
        }

       
	}

}
