package CinemaTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CinemaTimeManager manager = new CinemaTimeManager();

        try {
            manager.addMovie("Avengers Endgame", "18:30");
            manager.addMovie("Joker", "21:15");
            manager.addMovie("Interstellar", "15:45");
            

        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Display All Movies ---");
        manager.displayAllMovies();

        System.out.println("\n--- Search for 'er' ---");
        manager.searchMovie("er");

        System.out.println("\n--- Generate Report ---");
        manager.generateReport();
	}

}
