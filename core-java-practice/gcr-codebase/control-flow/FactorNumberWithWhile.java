package leetcodeBase;
import java.util.*;
public class FactorNumberWithWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        
        int number = sc.nextInt();

        
        if (number <= 0) {
            System.out.println("It is a negative integer.");
        } else {

            System.out.println("Factors of " + number + " are:");

            int counter = 1;

           
            while (counter <= number) {

                if (number % counter == 0) {
                    System.out.println(counter);
                }

                counter++; 
            }
        }
	}

}
