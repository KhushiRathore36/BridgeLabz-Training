package ExamProctor;
import java.util.*;
public class ExamProctor {
	Stack<Integer> navigationStack = new Stack<>();
    HashMap<Integer, String> answers = new HashMap<>();
    HashMap<Integer, String> correctAnswers = new HashMap<>();
    boolean isSubmitted = false;

   
    void loadCorrectAnswers() {
        correctAnswers.put(1, "B");
        correctAnswers.put(2, "A");
        correctAnswers.put(3, "D");
        correctAnswers.put(4, "C");
    }

   
    void visitQuestion(int qID) {
        if (isSubmitted) {
            System.out.println("Exam already submitted. No navigation allowed!");
            return;
        }

        navigationStack.push(qID);
        System.out.println("Visited Question: " + qID);
    }

    
    void answerQuestion(int qID, String answer) {
        if (isSubmitted) {
            System.out.println("Exam already submitted. Cannot modify answers!");
            return;
        }
        answers.put(qID, answer);
        System.out.println("Answered Q" + qID + " = " + answer);
    }

    
    int evaluateScore() {
        int score = 0;
        for (int qID : correctAnswers.keySet()) {
            String correct = correctAnswers.get(qID);
            String given = answers.getOrDefault(qID, "NA");
            if (correct.equals(given)) score++;
        }
        return score;
    }

   
    void submit() {
        if (isSubmitted) {
            System.out.println("Already Submitted!");
            return;
        }
        isSubmitted = true;

        System.out.println("\n--- SUBMISSION DETAILS ---");

        System.out.println("Navigation History (LIFO): " + navigationStack);
        System.out.println("Answers Attempted: " + answers);

        int finalScore = evaluateScore();
        System.out.println("Final Score = " + finalScore + "/" + correctAnswers.size());
    }
}
