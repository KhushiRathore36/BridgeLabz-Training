package Methods;
import java.util.*;
public class NumberChecker {

	public static int countDigits(int num) {
        int count = 0;

        while (num != 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    
    public static int[] getDigitsArray(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }

        return digits;
    }

    
    public static boolean isDuckNumber(int[] digits) {
        for (int i=0;i<digits.length;i++) {
            if (digits[i] != 0) {
                return true;
            }
        }
        return false;
    }

    
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;

        for (int i=0;i<digits.length;i++) {
            sum += Math.pow(digits[i], power);
        }

        return sum == number;
    }

   
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i=0;i<digits.length;i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        return new int[] { largest, secondLargest };
    }

   
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i=0;i<digits.length;i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }

        return new int[] { smallest, secondSmallest };
    }

    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int number = sc.nextInt();
    	int[] digits = getDigitsArray(number);
    	System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(number, digits));

        int[] largestValues = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + largestValues[0]);
        System.out.println("Second Largest Digit: " + largestValues[1]);

        int[] smallestValues = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + smallestValues[0]);
        System.out.println("Second Smallest Digit: " + smallestValues[1]);

   }

}
