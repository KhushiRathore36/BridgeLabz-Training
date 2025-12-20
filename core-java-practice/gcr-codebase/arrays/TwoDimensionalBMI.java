package Arrays;
import java.util.*;
public class TwoDimensionalBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

       
        int number = sc.nextInt();
        double[][] person = new double[number][3];
        String[] weightStatus = new String[number];

       
        for (int i = 0; i < number; i++) {
            
            while (true) {
               
                double weight = sc.nextDouble();
                if (weight > 0) {
                    person[i][0] = weight;
                    break;
                } else {
                    System.out.println("Sorry,Weight must be positive");
                }
            }

           
            while (true) {
               
                double height = sc.nextDouble();
                if (height > 0) {
                    personData[i][1] = height;
                    break;
                } else {
                    System.out.println("Sorry,Height must be positive");
                }
            }
        }

        
        for (int i = 0; i < number; i++) {

            double heightInMeter = person[i][1] / 100;
            person[i][2] = person[i][0] / 
                               (heightInMeter * heightInMeter);

           
            if (person[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (person[i][2] >= 18.5 && person[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (person[i][2] >= 25.0 && person[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight : " + person[i][0] + " kg");
            System.out.println("Height : " + person[i][1] + " cm");
            System.out.println("BMI    : " + String.format("%.2f", person[i][2]));
            System.out.println("Status : " + weightStatus[i]);
            
        }
	}

}
