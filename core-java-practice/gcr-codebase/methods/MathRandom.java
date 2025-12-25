package Methods;
import java.util.*;
public class MathRandom {

	public static int[] digitRandomArray(int size) {
        int[] num = new int[size];

        for (int i = 0; i < size; i++) {
            num[i] = (int) (Math.random() * 9000) + 1000;
        }

        return num;
    }

    
    public static double[] averageMinMax(int[] num) {

        int min = num[0];
        int max = num[0];
        int sum = 0;

        for (int i : num) {
            sum += i;
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        double average = (double) sum / num.length;

        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        int[] randomNum = digitRandomArray(5);
       
        double[] result = averageMinMax(randomNum);

        System.out.println( result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }

}
