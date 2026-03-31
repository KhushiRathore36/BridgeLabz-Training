package Methods;
import java.util.*;
public class MathSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double[] roots = findRoots(a, b, c);
		if (roots.length == 0) {
            System.out.println("No real roots");
        } else if (roots.length == 1) {
            System.out.println("Only one root: " + roots[0]);
        } else {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }
       
    }
	public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            return new double[0]; 
        }
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] { root };
        }
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        return new double[] { root1, root2 };

        
        

        
        
    }

}
