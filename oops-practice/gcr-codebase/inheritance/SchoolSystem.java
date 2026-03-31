package Inheritance;

public class SchoolSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
        Person student = new Student("Aman", 16, "10th Grade");
        Person staff = new Staff("Ramesh", 35, "Administration");

        teacher.displayBasicInfo();
        ((Teacher) teacher).displayRole();
        System.out.println();

        student.displayBasicInfo();
        ((Student) student).displayRole();
        System.out.println();

        staff.displayBasicInfo();
        ((Staff) staff).displayRole();
	}

}
class Person {
    String name;
    int age;

   
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}


class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}


class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}