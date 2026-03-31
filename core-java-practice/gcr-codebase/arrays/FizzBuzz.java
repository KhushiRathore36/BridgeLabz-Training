package Arrays;
import java.util.*;
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Sorry you can't go ahead");
            
        }
        else {
        	String[] result = new String[number + 1];

            
            for (int i = 0; i <= number; i++) {

                if (i != 0 && i % 3 == 0 && i % 5 == 0) {
                    result[i] = "FizzBuzz";
                } else if (i != 0 && i % 3 == 0) {
                    result[i] = "Fizz";
                } else if (i != 0 && i % 5 == 0) {
                    result[i] = "Buzz";
                } else {
                    result[i] = String.valueOf(i);
                }
            }

            
            for (int i = 0; i <= number; i++) {
                System.out.println("Position " + i + " = " + result[i]);
            }
        }
        
        

	}

}
