package leetcodeBase;
import java.util.*;
public class DistanceYardsToMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double distance_In_Feet = sc.nextDouble();

        double distance_In_Yards = distance_In_Feet / 3;
        double distance_In_Miles = distance_In_Yards / 1760;

        System.out.println("Distance in Yards: " + distance_In_Yards);
        System.out.println("Distance in Miles: " + distance_In_Miles);
	}

}
