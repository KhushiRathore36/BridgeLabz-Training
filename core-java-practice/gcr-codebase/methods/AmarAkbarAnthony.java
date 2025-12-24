package Methods;
import java.util.*;
public class AmarAkbarAnthony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};

        int[] ages = new int[3];
        double[] heights = new double[3];

        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();

            
        }

        int youngIndex = youngest(ages);
        int tallIndex = tallest(heights);

        System.out.println("Youngest friend is: " + names[youngIndex] +
                " (Age: " + ages[youngIndex] + ")");

        System.out.println("Tallest friend is: " + names[tallIndex] +
                " (Height: " + heights[tallIndex] + " cm)");

       
	}
	public static int youngest(int[] ages) {
        int index = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[index]) {
                index = i;
            }
        }
        return index;
    }

    
    public static int tallest(double[] heights) {
        int index = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[index]) {
                index = i;
            }
        }
        return index;
    }

}
