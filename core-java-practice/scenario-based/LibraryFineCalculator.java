package ScenarioBased;
import java.util.*;
public class LibraryFineCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int finePerDay = 5;

        for (int i = 1; i <= 5; i++) {
           

            System.out.print("Enter Due Date: ");
            int dueDate = sc.nextInt();

            System.out.print("Enter Return Date: ");
            int returnDate = sc.nextInt();

            if (returnDate > dueDate) {
                int late = returnDate - dueDate;
                int fine = late * finePerDay;
                System.out.println("Late by " + late + " days");
                System.out.println("Fine: " + fine);
            } else {
                System.out.println("Returned on time");
            }
        }
	}

}
