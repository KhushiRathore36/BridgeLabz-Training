package SortCSV;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Main {
	public static void main(String[] args) {

        String filePath = "employees.csv";
        List<Employee> employees = new ArrayList<>();

        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine(); 

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                employees.add(new Employee(id, name, department, salary));
            }

        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.salary, e1.salary);
            }
        });

       
        System.out.println("Top 5 Highest-Paid Employees:\n");

        int limit = Math.min(5, employees.size());
        for (int i = 0; i < limit; i++) {
            employees.get(i).display();
        }
    }
}
