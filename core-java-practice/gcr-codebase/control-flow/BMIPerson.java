package leetcodeBase;
import java.util.*;
public class BMIPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double heightInCm = sc.nextDouble();
        double heightInMeter = heightInCm / 100;
        double bmi = weight / (heightInMeter * heightInMeter);
        if (bmi <= 18.4) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
	}

}
