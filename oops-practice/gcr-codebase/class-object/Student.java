package OPPSProblem;

public class Student {
    String name;
    String rollNumber;
    double mark1, mark2, mark3;

    
    Student(String name, String rollNumber, double mark1, double mark2, double mark3) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    
    char calculateGrade() {
        double average = (mark1 + mark2 + mark3) / 3;

        if (average >= 75) {
            return 'A';
        } else if (average >= 60) {
            return 'B';
        } else {
            return 'C';
        }
    }

    
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);
        System.out.println("Student Marks:");
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
        System.out.println("Mark3: " + mark3);
        System.out.println("Grade " + calculateGrade());
        System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Thamarai", "ECE001", 80.0, 70.0, 75.0);
        Student s2 = new Student("Kannan", "CSC002", 60.0, 65.0, 50.0);

        s1.display();
        s2.display();
	}

}
