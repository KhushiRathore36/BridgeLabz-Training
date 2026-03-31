package ScenarioBased;
import java.util.*;
public class Festival {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        while (true) {

            
            int num = sc.nextInt();

           
            if (num== -1) {
                break;
            }

           
            if (num <= 0) {
                System.out.println("Invalid number");
                continue;
            }

           
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("You won a gift!");
            } else {
                System.out.println("Better luck next time!");
            }
        }

         
	}

}
