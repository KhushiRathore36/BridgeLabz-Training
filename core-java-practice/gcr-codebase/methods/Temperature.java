package Methods;
import java.util.*;
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        double temperature = sc.nextDouble();
        double windSpeed = sc.nextDouble();

        double ans = calculateWindChill(temperature, windSpeed);

        System.out.println("Wind Chill Temperature: " + ans);

	}
	public static double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

}
