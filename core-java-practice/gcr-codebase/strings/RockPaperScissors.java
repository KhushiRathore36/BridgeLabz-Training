package Strings;
import java.util.*;
public class RockPaperScissors {

	public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);

        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    
    public static String findWinner(String user, String computer) {

        if (user.equalsIgnoreCase(computer)) {
            return "Draw";
        }

        if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            return "User";
        }

        return "Computer";
    }

   
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {

        double userPercent = ((double) userWins / totalGames) * 100;
        double computerPercent = ((double) computerWins / totalGames) * 100;

        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercent) + "%";

        return stats;
    }

   
    public static void displayResults(String[][] gameResults, String[][] stats) {

        
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" +
                    gameResults[i][0] + "\t" +
                    gameResults[i][1] + "\t\t" +
                    gameResults[i][2]);
        }

        
       

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int games = sc.nextInt();

        String[][] gameResults = new String[games][3];

        int userWinsCount = 0;
        int computerWinsCount = 0;

        for (int i = 0; i < games; i++) {

           
            String userChoice = sc.next();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;

            if (winner.equals("User"))
                userWinsCount++;
            else if (winner.equals("Computer"))
                computerWinsCount++;
        }

        String[][] stats = calculateStats(userWinsCount, computerWinsCount, games);
        displayResults(gameResults, stats);

        sc.close();
    }

}
