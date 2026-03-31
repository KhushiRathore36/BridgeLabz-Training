package Keywords;

public class Student {
	static String universityName = "National Technical University";
    static int totalStudents = 0;
    String name;
    char grade;
    final int rollNumber;
    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
        System.out.println("University Name: " + universityName);
    }
    static void displayStudentDetails(Object obj) {

        if (obj instanceof Student) {   
            Student s = (Student) obj;
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("Name: " + s.name);
            System.out.println("Grade: " + s.grade);
            System.out.println("University: " + universityName);
            System.out.println();
        } else {
            System.out.println("Invalid Student Object");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Anita", 201, 'A');
        Student student2 = new Student("Rahul", 202, 'B');
        displayTotalStudents();
        displayStudentDetails(student1);
        displayStudentDetails(student2);
	}

}
