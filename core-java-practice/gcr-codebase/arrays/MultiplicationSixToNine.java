package Arrays;
import java.util.*;
public class MultiplicationSixToNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] multiResult = new int[4];
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiResult[index] = number * i;
            index++;
        }
         index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiResult[index]);
            index++;
        }

	}

}
