package AccessModifiers;

public class Employee {
	public int employeeID;
    protected String department;
    private double salary;
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
    public double getSalary() {
        return salary;
    }
    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee {
    String role;
    Manager(int employeeID, String department, double salary, String role) {
        super(employeeID, department, salary);
        this.role = role;
    }
    void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);   
        System.out.println("Department: " + department);    
        System.out.println("Role: " + role);
        System.out.println("Salary: " + getSalary());        
    }
    public static void main(String[] args) {

        Employee employee = new Employee(101, "IT", 45000);
        employee.displayEmployeeDetails();

        
        System.out.println("Updated Salary: " + employee.getSalary());

        

        Manager manager = new Manager(201, "HR", 80000, "Team Lead");
        manager.displayManagerDetails();
    }
}
