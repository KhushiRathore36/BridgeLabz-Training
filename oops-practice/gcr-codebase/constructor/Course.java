package OPPSProblem;

public class Course {
	String courseName;
    int duration;   
    double fee;

    
    static String instituteName = "BridgeLabz";

    
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        
    }

    
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1 = new Course("Java Full Stack", 6, 45000);
        Course course2 = new Course("Python Development", 4, 35000);

        course1.displayCourseDetails();
        course2.displayCourseDetails();

       
        Course.updateInstituteName("Tech Academy");

        course1.displayCourseDetails();
        course2.displayCourseDetails();
	}

}
