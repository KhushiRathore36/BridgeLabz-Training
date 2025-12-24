package Methods;
import java.util.*;
public class SumOfNaturalNumberWithRecursion {

	public static int recursiveSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sumRecursion = recursiveSum(n);
        int sumFormula = formulaSum(n);

        System.out.println("Sum using Recursion: " + sumRecursion);
        System.out.println("Sum using Formula: " + sumFormula);

        if (sumRecursion == sumFormula) {
            System.out.println("Result are equal");
        } else {
            System.out.println("Results are not equal");
        }
    }
}
