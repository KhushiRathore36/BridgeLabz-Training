package ConvertCSV;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

        String filePath = "students.csv";
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Header skip
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                Student student = new Student(id, name, age, marks);
                students.add(student);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Print List
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
