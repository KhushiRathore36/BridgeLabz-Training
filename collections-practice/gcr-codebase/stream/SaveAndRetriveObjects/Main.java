package SaveAndRetriveObjects;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args) {

        
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Khushi", "IT", 50000));
        employees.add(new Employee(102, "Aman", "HR", 45000));
        employees.add(new Employee(103, "Riya", "Finance", 60000));

        String filename = "employees.dat";

       
        serializeEmployees(employees, filename);

       
        List<Employee> retrievedEmployees = deserializeEmployees(filename);

        
        if (retrievedEmployees != null) {
            System.out.println("\nDeserialized Employees:");
            for (Employee emp : retrievedEmployees) {
                System.out.println(emp);
            }
        }
    }

  
    public static void serializeEmployees(List<Employee> employees, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(employees);
            System.out.println("Employees serialized successfully!");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Employee> deserializeEmployees(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (List<Employee>) ois.readObject();
        } catch (IOException e) {
            System.out.println("Deserialization IO error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
        return null;
    }
}
