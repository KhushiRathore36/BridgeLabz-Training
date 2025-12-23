package Strings;
import java.util.*;
public class CalculateTheGrade {

	public static int[][] generatePCMScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = rand.nextInt(90) + 10; 
            scores[i][1] = rand.nextInt(90) + 10; 
            scores[i][2] = rand.nextInt(90) + 10; 
        }
        return scores;
    }

    
    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    
    public static String[][] calculateGrade(double[][] result) {
        String[][] grade = new String[result.length][2];

        for (int i = 0; i < result.length; i++) {
            double percent = result[i][2];

            if (percent >= 80) {
                grade[i][0] = "A";
                grade[i][1] = "Level 4";
            } else if (percent >= 70) {
                grade[i][0] = "B";
                grade[i][1] = "Level 3";
            } else if (percent >= 60) {
                grade[i][0] = "C";
                grade[i][1] = "Level 2";
            } else if (percent >= 50) {
                grade[i][0] = "D";
                grade[i][1] = "Level 1";
            } else if (percent >= 40) {
                grade[i][0] = "E";
                grade[i][1] = "Level 1";
            } else {
                grade[i][0] = "R";
                grade[i][1] = "Remedial standards";
            }
        }
        return grade;
    }

    
   

    
    public static void main(String[] args) {
        int students = 5;

        int[][] scores = generatePCMScores(students);
        double[][] result = calculateResults(scores);
        String[][] grade = calculateGrade(result);

       
    }

}
