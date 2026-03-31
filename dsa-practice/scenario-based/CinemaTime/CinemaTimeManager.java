package CinemaTime;
import java.util.ArrayList;
import java.util.List;
public class CinemaTimeManager {
	private final List<String> movieTitles = new ArrayList<>();
    private final List<String> showTimes = new ArrayList<>();

    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException("Invalid time format: " + time);
        }
        movieTitles.add(title);
        showTimes.add(time);
    }

    // Valid time format HH:MM (24-hour)
    private boolean isValidTime(String time) {
        if (time == null || !time.matches("\\d{2}:\\d{2}")) return false;

        int hour = Integer.parseInt(time.substring(0, 2));
        int min = Integer.parseInt(time.substring(3, 5));
        return (hour >= 0 && hour <= 23) && (min >= 0 && min <= 59);
    }

    public void searchMovie(String keyword) {
        boolean found = false;
        for (int i = 0; i < movieTitles.size(); i++) {
            try {
                if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println("Found: " + movieTitles.get(i) + " at " + showTimes.get(i));
                    found = true;
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Search error at index: " + i);
            }
        }
        if (!found) System.out.println("No movies matched your search keyword.");
    }

    public void displayAllMovies() {
        if (movieTitles.isEmpty()) {
            System.out.println("No movies scheduled.");
            return;
        }
        for (int i = 0; i < movieTitles.size(); i++) {
            System.out.println(String.format("%d. %s - %s", i + 1, movieTitles.get(i), showTimes.get(i)));
        }
    }

    // Convert Lists → Arrays for reporting
    public void generateReport() {
        String[] titlesArray = movieTitles.toArray(new String[0]);
        String[] timeArray = showTimes.toArray(new String[0]);

        System.out.println("\n=== Printable Report ===");
        for (int i = 0; i < titlesArray.length; i++) {
            System.out.println((i + 1) + ") " + titlesArray[i] + " @ " + timeArray[i]);
        }
        System.out.println("========================\n");
    }
}
