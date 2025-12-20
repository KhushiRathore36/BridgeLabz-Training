package Arrays;
import java.util.*;
public class MaximumValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            
            double value = sc.nextDouble();
            if (value <= 0) {
                break;
            }
            if (index == 10) {
                break;
            }
            numbers[index] = value;
            index++;
        }

        
        
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        
        System.out.println(total);
        
	}

}
