package Stream;
import java.io.*;
public class FileCopyDemo {
	public static void main(String[] args) {
        File sourceFile = new File("source.txt");
        File destFile = new File("destination.txt");

        // Check if source exists
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist!");
            return;
        }

        try (
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destFile);
        ) {
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
