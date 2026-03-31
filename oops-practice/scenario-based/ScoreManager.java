package ScenarioBased;
import java.util.*;
public class ScoreManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        
        int n = getNumberOfStudents(sc);

       
        double[] scores = getScores(sc, n);

        
        double average = average(scores);

        
        double highest = highest(scores);
        double lowest = lowest(scores);

        
       
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);

       
        boolean anyAbove = false;
        for (double score : scores) {
            if (score > average) {
                System.out.println(score);
                anyAbove = true;
            }
        }
        if (!anyAbove) {
            System.out.println("No scores above average.");
        }
	}
	public static int getNumberOfStudents(Scanner sc) {
        int n;
        while (true) {
            System.out.print("Enter number of students: ");
            String input = sc.nextLine();
            try {
                n = Integer.parseInt(input);
                if (n <= 0) {
                    System.out.println("Number of students must be greater than 0.");
                    continue;
                }
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }
    }
	public static double[] getScores(Scanner sc, int n) {
        double[] scores = new double[n];
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter score for student " + (i + 1) + ": ");
                String input = sc.nextLine();
                try {
                    double score = Double.parseDouble(input);
                    if (score < 0) {
                        System.out.println("Score cannot be negative. Try again.");
                        continue;
                    }
                    scores[i] = score;
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a numeric value.");
                }
            }
        }
        return scores;
    }
	public static double average(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    
    public static double highest(double[] scores) {
        double highest = scores[0];
        for (double score : scores) {
            if (score > highest) highest = score;
        }
        return highest;
    }
    public static double lowest(double[] scores) {
        double lowest = scores[0];
        for (double score : scores) {
            if (score < lowest) lowest = score;
        }
        return lowest;
    }
}
