package Methods;
import java.util.*;
public class TrignometricFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        double angle = sc.nextDouble();

        double[] ans = calculateTrigonometricFunctions(angle);

        System.out.println("Sine: " + ans[0]);
        System.out.println("Cosine: " + ans[1]);
        System.out.println("Tangent: " + ans[2]);
        

	}
	public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        double ans[]=new double[3];
        ans[0]=sine;
        ans[1]=cosine;
        ans[2]=tangent;
        return ans;
    }

}
