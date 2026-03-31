package ReadCSV;
import java.io.BufferedReader;
import java.io.FileReader;
public class Main {
	public static void main(String[] args) {

        String filePath = "Students.csv"; 

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                Student student = new Student(id, name, age, marks);
                student.display();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
