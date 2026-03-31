package Keywords;

public class Patient {
	static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    
    String name;
    int age;
    String ailment;

    
    final String patientID;

    
    Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    
    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
        System.out.println("Hospital Name: " + hospitalName);
    }

   
    static void displayPatientDetails(Object obj) {

        if (obj instanceof Patient) {   
            Patient p = (Patient) obj;

            System.out.println("Patient ID: " + p.patientID);
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Ailment: " + p.ailment);
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println();
        } else {
            System.out.println("Invalid Patient Object");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p1 = new Patient("P001", "Lathika", 30, "Flu");
        Patient p2 = new Patient("P002", "Lidiya", 45, "Fracture");

       
        getTotalPatients();

        
        displayPatientDetails(p1);
        displayPatientDetails(p2);
	}

}
