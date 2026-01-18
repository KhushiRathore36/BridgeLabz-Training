package Complexity;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testValues = {10, 30, 40};

        for (int n : testValues) {
            System.out.println("\n=== Fibonacci(" + n + ") ===");

           
            if (n <= 40) { 
                long startRecursive = System.currentTimeMillis();
                int resRec = fibonacciRecursive(n);
                long endRecursive = System.currentTimeMillis();
                System.out.println("Recursive Result = " + resRec + ", Time = " + (endRecursive - startRecursive) + " ms");
            } else {
                System.out.println("Recursive: Skipped (would take too long)");
            }

           
            long startIter = System.currentTimeMillis();
            int resItr = fibonacciIterative(n);
            long endIter = System.currentTimeMillis();
            System.out.println("Iterative Result = " + resItr + ", Time = " + (endIter - startIter) + " ms");
        }
	}
	public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
