package Methods;
import java.util.*;
public class AverageSubjects {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int students = sc.nextInt();

        int[][] scores = generatePCMScores(students);
        double[][] results = calculateResults(scores);

        display(scores, results);
        
    }

	public static int[][] generatePCMScores(int students) {
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10; 
            scores[i][1] = (int)(Math.random() * 90) + 10; 
            scores[i][2] = (int)(Math.random() * 90) + 10;
        }
        return scores;
    }

    
    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    
    public static String getGrade(double percent) {
        if (percent >= 80) return "A";
        else if (percent >= 70) return "B";
        else if (percent >= 60) return "C";
        else if (percent >= 50) return "D";
        else if (percent >= 40) return "E";
        else return "R";
    }

    
    public static String getRemarks(String grade) {
        switch (grade) {
            case "A": return "Level 4";
            case "B": return "Level 3";
            case "C": return "Level 2";
            case "D": return "Level 1";
            case "E": return "Below Level 1";
            default: return "Remedial";
        }
    }

    
    public static void display(int[][] scores, double[][] result) {

        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade\tRemarks");
        System.out.println("----------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            String grade = getGrade(result[i][2]);
            String remarks = getRemarks(grade);

            System.out.println(
                (i+1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t" +
                scores[i][2] + "\t" +
                (int)result[i][0] + "\t" +
                result[i][1] + "\t" +
                result[i][2] + "\t" +
                grade + "\t" +
                remarks
            );
        }
    }

    
    

}
