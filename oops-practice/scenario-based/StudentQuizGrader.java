package ScenarioBased;
import java.util.*;
public class StudentQuizGrader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        
        String[] correctAnswers = {
            "A", "B", "C", "D", "A",
            "C", "B", "D", "A", "B"
        };

        
        String[] studentAnswers = new String[10];

        
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter answer for Question " + (i + 1) + " (A/B/C/D): ");
                String input = sc.nextLine().toUpperCase();

                if (input.equals("A") || input.equals("B") ||
                    input.equals("C") || input.equals("D")) {
                    studentAnswers[i] = input;
                    break;
                } else {
                    System.out.println("Invalid input. Please enter A, B, C, or D.");
                }
            }
        }

        
        System.out.println("\n--- Quiz Feedback ---");
        for (int i = 0; i < 10; i++) {
            if (studentAnswers[i].equalsIgnoreCase(correctAnswers[i])) {
                System.out.println("Question " + (i + 1) + ": Correct");
            } else {
                System.out.println("Question " + (i + 1) + ": Incorrect (Correct Answer: "
                        + correctAnswers[i] + ")");
            }
        }

       
        int score = calculateScore(correctAnswers, studentAnswers);

        
        double percentage = (score / 10.0) * 100;

       
        System.out.println("\nTotal Score: " + score + "/10");
        System.out.println("Percentage: " + percentage + "%");

        
        if (percentage >= 50) {
            System.out.println("Result: PASS ✅");
        } else {
            System.out.println("Result: FAIL ❌");
        }
	}
	public static int calculateScore(String[] correct, String[] student) {
        int score = 0;

        for (int i = 0; i < correct.length; i++) {
            if (student[i].equalsIgnoreCase(correct[i])) {
                score++;
            }
        }
        return score;
    }
}
