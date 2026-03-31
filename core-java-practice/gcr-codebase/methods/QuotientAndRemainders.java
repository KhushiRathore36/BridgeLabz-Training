package Methods;
import java.util.*;
public class QuotientAndRemainders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int divisor = sc.nextInt();

        int[] ans = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient: " + ans[0]);
        System.out.println("Remainder: " + ans[1]);
	}
	public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        int ans[]=new int[2];
        ans[0]=quotient;
        ans[1]=remainder;
        return ans;
    }

}
