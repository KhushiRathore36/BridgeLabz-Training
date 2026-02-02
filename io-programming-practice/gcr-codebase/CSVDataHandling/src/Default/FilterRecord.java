package Default;
import java.io.BufferedReader;
import java.io.FileReader;
public class FilterRecord {
	public static void main(String[] args) {

        String filePath = "Students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Header skip
            br.readLine();

            System.out.println("Students scoring more than 80:\n");

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                if (marks > 80) {
                    System.out.println(
                        "ID: " + id +
                        ", Name: " + name +
                        ", Age: " + age +
                        ", Marks: " + marks
                    );
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
