package Stream;
import java.io.*;
public class FileStream {
	public static void main(String[] args) {
        
        String inputFile = "input.txt";
        String outputFile = "output_lowercase.txt";

        
        String charset = "UTF-8";

        try (
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(inputFile), charset)
            );
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream(outputFile), charset)
            )
        ) {
            int ch;
            while ((ch = reader.read()) != -1) {
                
                writer.write(Character.toLowerCase(ch));
            }

            System.out.println("File converted to lowercase and saved as: " + outputFile);

        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
