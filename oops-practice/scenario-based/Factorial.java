package ScenarioBased;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Factorial of 5: " + MathUtility.factorial(5));
        System.out.println("Factorial of 0: " + MathUtility.factorial(0));
        System.out.println("Factorial of -2: " + MathUtility.factorial(-2));

        
        System.out.println("Is 7 prime? " + MathUtility.isPrime(7));
        System.out.println("Is 1 prime? " + MathUtility.isPrime(1));
        System.out.println("Is -5 prime? " + MathUtility.isPrime(-5));

       
        System.out.println("GCD of 24 and 36: " + MathUtility.gcd(24, 36));
        System.out.println("GCD of -12 and 8: " + MathUtility.gcd(-12, 8));

        
        System.out.println("Fibonacci of 6: " + MathUtility.fibonacci(6));
        System.out.println("Fibonacci of 0: " + MathUtility.fibonacci(0));
        System.out.println("Fibonacci of -3: " + MathUtility.fibonacci(-3));
	}

}
class MathUtility {

   
    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    
    public static long fibonacci(int n) {
        if (n < 0) {
            System.out.println("Fibonacci is not defined for negative numbers.");
            return -1;
        }

        if (n == 0) return 0;
        if (n == 1) return 1;

        long first = 0, second = 1;

        for (int i = 2; i <= n; i++) {
            long next = first + second;
            first = second;
            second = next;
        }
        return second;
    }
}