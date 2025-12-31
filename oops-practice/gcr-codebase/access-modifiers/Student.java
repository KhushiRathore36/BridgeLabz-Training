package AccessModifiers;

public class Student {
	public int rollNumber;
    protected String name;
    private double CGPA;
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    
    public double getCGPA() {
        return CGPA;
    }

    
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    
    void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}
class PostgraduateStudent extends Student {

    String specialization;

    
    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

   
    void displayPostgraduateDetails() {
        System.out.println("Roll Number: " + rollNumber);   
        System.out.println("Name: " + name);                 
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCGPA());             
    }
    public static void main(String[] args) {

        
        Student s1 = new Student(101, "Rohan", 8.2);
        s1.displayStudentDetails();

        
        s1.setCGPA(8.6);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        

       
        PostgraduateStudent pg = new PostgraduateStudent(
                201, "Anita", 9.1, "Computer Science"
        );
        pg.displayPostgraduateDetails();
    }
}



