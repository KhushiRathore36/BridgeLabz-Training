package Strings;
import java.util.*;
public class BodyMassIndex {

	public static String[][] BMIAndStatus(double[][] data) {
        String[][] ans = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100; 

            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            ans[i][0] = String.valueOf(heightCm);
            ans[i][1] = String.valueOf(weight);
            ans[i][2] = String.valueOf(bmi);
            ans[i][3] = status;
        }
        return ans;
    }

   
    

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2]; 

        for (int i = 0; i < 10; i++) {
           
            data[i][0] = sc.nextDouble();

            data[i][1] = sc.nextDouble();
        }

        String[][] ans = BMIAndStatus(data);
       System.out.println(ans);
    }

}
