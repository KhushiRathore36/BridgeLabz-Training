package Arrays;
import java.util.*;
public class FactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();

        
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;
                    int[] arr = new int[maxFactor];

                    
                    for (int j = 0; j < factors.length; j++) {
                        arr[j] = factors[j];
                    }

                    factors = arr;
                }

                
                factors[index] = i;
                index++;
            }
        }

        
        System.out.println(number);
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        
	}

}
