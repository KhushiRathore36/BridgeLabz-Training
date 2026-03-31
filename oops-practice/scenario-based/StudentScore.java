package ScenarioBased;

public class StudentScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {78, 85, 92, 66, 88};

        try {
            System.out.println("Average Score: " +
                    StudentScoreAnalyzer.calculateAverage(scores));
            System.out.println("Highest Score: " +
                    StudentScoreAnalyzer.findMax(scores));
            System.out.println("Lowest Score: " +
                    StudentScoreAnalyzer.findMin(scores));
        } catch (InvalidScoreException e) {
            System.out.println("Error: " + e.getMessage());
        }

        
        int[] invalidScores = {70, 105, 60};

        try {
            System.out.println("\nTesting invalid scores...");
            StudentScoreAnalyzer.calculateAverage(invalidScores);
        } catch (InvalidScoreException e) {
            System.out.println("Error: " + e.getMessage());
        } 
	}

}
class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}


class StudentScoreAnalyzer {

    
    private static void validateScores(int[] scores) throws InvalidScoreException {
        for (int score : scores) {
            if (score < 0 || score > 100) {
                throw new InvalidScoreException(
                        "Invalid score found: " + score + ". Score must be between 0 and 100."
                );
            }
        }
    }

    
    public static double calculateAverage(int[] scores) throws InvalidScoreException {
        validateScores(scores);

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    
    public static int findMax(int[] scores) throws InvalidScoreException {
        validateScores(scores);

        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    
    public static int findMin(int[] scores) throws InvalidScoreException {
        validateScores(scores);

        int min = scores[0];
        for (int score : scores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }
}
