package Arrays;
import java.util.*;
public class FrequencyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp1 = num;
        int count = 0;

        
        while (temp1 != 0) {
            count++;
            temp1 /= 10;
        }

       
        int[] digits = new int[count];
        temp1 = num;
        int index = 0;

        while (temp1 != 0) {
            digits[index] = temp1 % 10;
            temp1 /= 10;
            index++;
        }

        
        int[] frequency = new int[10];

       
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
	}

}
