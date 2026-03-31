package Arrays;
import java.util.*;
public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] weight = new double[n];     
        double[] height = new double[n];     
        double[] bmi = new double[n];
        String[] status = new String[n];

        
        for (int i = 0; i < n; i++) {
            
            weight[i] = sc.nextDouble();

            
            height[i] = sc.nextDouble();
        }

        
        for (int i = 0; i < n; i++) {

            double heightInMeter = height[i] / 100; 
            bmi[i] = weight[i] / (heightInMeter * heightInMeter);

            
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height : " + height[i] + " cm");
            System.out.println("Weight : " + weight[i] + " kg");
            System.out.println("BMI    : " + String.format("%.2f", bmi[i]));
            System.out.println("Status : " + status[i]);
            
        }
	}

}
