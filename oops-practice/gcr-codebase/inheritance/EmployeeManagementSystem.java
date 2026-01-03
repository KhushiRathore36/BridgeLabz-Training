package Inheritance;

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Manager("Rohan", 101, 80000, 10);
        Employee emp2 = new Developer("Anita", 102, 60000, "Java");
        Employee emp3 = new Intern("Rahul", 103, 15000, 6);

        emp1.displayDetails();
        System.out.println();

        emp2.displayDetails();
        System.out.println();

        emp3.displayDetails();
	}

}
class Employee {
    String name;
    int id;
    double salary;

   
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}


class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}


class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}


class Intern extends Employee {
    int duration; 

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
    }
}
