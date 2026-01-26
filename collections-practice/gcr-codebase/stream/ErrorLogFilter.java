package Stream;
import java.io.*;
public class ErrorLogFilter {
	public static void main(String[] args) {
        String filename = "biglog.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
