package Extras;
import java.util.*;

public class NumberOfGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int min=1;
        int max=100;
        boolean guess=false;
        while(!guess) {
        	int computerGuess = generateGuess(min, max);
            System.out.println("computer guess: " + computerGuess);
        	String feedback=sc.next();
        	feedback=feedback.toLowerCase();
        	if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number correctly ");
                guess = true;
            } else {
                int[] range = updateRange(feedback, computerGuess, min, max);
                min = range[0];
                max = range[1];
            }
        	
        }
	}
	public static int[] updateRange(String feedback, int guess, int min, int max) {
        if (feedback.equals("high")) {
            max = guess - 1;
        } else if (feedback.equals("low")) {
            min = guess + 1;
        }
        return new int[]{min, max};
    }
	 public static int generateGuess(int min, int max) {
	        Random rand = new Random();
	        return rand.nextInt(max - min + 1) + min;
	 }

}
