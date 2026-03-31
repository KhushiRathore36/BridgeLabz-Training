package Arrays;
import java.util.*;
public class YoungestFreinds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        
        for (int i = 0; i < 3; i++) {
           age[i] = sc.nextInt();
           height[i] = sc.nextDouble();
        }

        
        int youngIndex = 0;
        int tallIndex = 0;

        
        for (int i = 1; i < 3; i++) {

            if (age[i] < age[youngIndex]) {
                youngIndex = i;
            }

            if (height[i] > height[tallIndex]) {
                tallIndex = i;
            }
        }

        
       
        System.out.println("Youngest Friend: " + names[youngIndex] + 
                           " (Age: " + age[youngIndex] + ")");

        System.out.println("Tallest Friend: " + names[tallIndex] + 
                           " (Height: " + height[tallIndex] + " cm)");

	}

}
