package Methods;
import java.util.*;
public class NumberCheckerWithMathPow {

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

    
    public static int sumOfDigits(int[] digits) {
        int sum = 0;

        for (int d : digits) {
            sum += d;
        }

        return sum;
    }

    
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, 2);
        }

        return sum;
    }

    
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        
        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] digits = getDigitsArray(number);
        

        int sum = sumOfDigits(digits);
        System.out.println(sum);

        int sumSquares = sumOfSquaresOfDigits(digits);
        System.out.println(sumSquares);

        System.out.println(isHarshadNumber(number, digits));

        int[][] frequency = digitFrequency(digits);
        

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("  " + frequency[i][0] + "        " + frequency[i][1]);
            }
        }

        

        

        
    }

}
