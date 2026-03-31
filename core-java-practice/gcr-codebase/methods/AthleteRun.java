package Methods;
import java.util.*;
public class AthleteRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();  
		System.out.println("Number of rounds needed to complete 5 km run: " + calculateRounds(side1, side2, side3));

    }
	public static double calculateRounds(double side1,double side2,double side3) {
		double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; 
        double rounds = totalDistance / perimeter;
        return rounds;
	}

}
