package Arrays;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        
        int num = sc.nextInt();

        int tempNum = num;

        
        int count = 0;
        while (tempNum != 0) {
            count++;
            tempNum = tempNum/ 10;
        }

        
        int[] digit = new int[count];
        tempNum = num;

        for (int i = 0; i < count; i++) {
            digit[i] = tempNum % 10; 
            tempNum = tempNum / 10;
        }

        
        int[] reverse = new int[count];

        for (int i = 0; i < count; i++) {
            reverse[i] = digit[count - 1 - i];
        }

        
        
        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i]+" ");
        }

	}

}
