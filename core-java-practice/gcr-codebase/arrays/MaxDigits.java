package Arrays;
import java.util.*;
public class MaxDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        
        
        int num = sc.nextInt();

        
        int maxDigit = 10;
        int[] digit = new int[maxDigit];
        int index = 0;

        
        while (num != 0) {

           
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;         
                int[] arr = new int[maxDigit];   

                
                for (int i = 0; i < digit.length; i++) {
                    arr[i] = digit[i];
                }

                digit = arr; 
            }

            digit[index] = num % 10; 
            index++;
            num = num / 10;        
        }

        
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digit[i] > largest) {
                secondLargest = largest;
                largest = digit[i];
            } else if (digit[i] > secondLargest && digit[i] != largest) {
                secondLargest = digit[i];
            }
        }

        
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
	}

}

