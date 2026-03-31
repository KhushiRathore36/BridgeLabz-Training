package Methods;
import java.util.*;
public class Chocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int numberOfChocolates = sc.nextInt();
        int numberOfChildren = sc.nextInt();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("Chocolates each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);

	}
	public static int[] findRemainderAndQuotient(int number, int divisor) {
        int chocolatesEach = number / divisor;
        int remainingChocolates = number % divisor;
        int ans[]=new int[2];
        ans[0]=chocolatesEach;
        ans[1]=remainingChocolates;
        return ans;
    }

}
