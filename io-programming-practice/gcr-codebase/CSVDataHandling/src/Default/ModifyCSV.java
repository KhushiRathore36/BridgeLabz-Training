package Default;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ModifyCSV {
	public static void main(String[] args) {

        String inputFile = "employees.csv";
        String outputFile = "employees_updated.csv";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFile)
        ) {

            String line;

            // Read & write header
            line = br.readLine();
            writer.write(line + "\n");

            // Read remaining rows
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                // Increase salary by 10% for IT department
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);
                }

                // Write updated row
                writer.write(
                    id + "," +
                    name + "," +
                    department + "," +
                    salary + "\n"
                );
            }

            System.out.println("Updated CSV file created successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
