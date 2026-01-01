package Keywords;

public class Employee {
	static String companyName = "Tech Solutions Inc.";
    static int totalEmployees = 0;
    String name;
    String designation;
    final int id;
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Company Name: " + companyName);
    }
    static void displayEmployeeDetails(Object obj) {
        if (obj instanceof Employee) {  
            Employee emp = (Employee) obj;
            System.out.println("Employee ID: " + emp.id);
            System.out.println("Name: " + emp.name);
            System.out.println("Designation: " + emp.designation);
            System.out.println("Company Name: " + companyName);
        } else {
            System.out.println("Not an Employee object");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("Thamarai", 101, "Software Engineer");
        Employee employee2 = new Employee("Rohan", 102, "Project Manager");

        // Display output
        displayTotalEmployees();
        displayEmployeeDetails(employee1);
        displayEmployeeDetails(employee2);
	}

}
