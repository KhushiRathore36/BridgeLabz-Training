package Encapsulation;
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient implements MedicalRecord {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    private String[] medicalHistory;
    private int recordCount = 0;

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.medicalHistory = new String[10];
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    public void addRecord(String record) {
        if (recordCount < medicalHistory.length) {
            medicalHistory[recordCount++] = record;
        }
    }

    public void viewRecords() {
        System.out.println("Medical Records:");
        for (int i = 0; i < recordCount; i++) {
            System.out.println("- " + medicalHistory[i]);
        }
    }
}

class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int patientId, String name, int age, String diagnosis, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    public double calculateBill() {
        return daysAdmitted * dailyCharge + 2000;
    }
}

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }
}

class HospitalBilling {
    public static void processPatient(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Diagnosis: " + patient.getDiagnosis());
        patient.viewRecords();
        System.out.println("Total Bill: ₹" + patient.calculateBill());
        
    }
}
public class HospitalManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p1 = new InPatient(101, "Amit", 45, "Pneumonia", 5, 3000);
        p1.addRecord("Admitted to ICU");
        p1.addRecord("Oxygen support provided");

        Patient p2 = new OutPatient(102, "Neha", 30, "Fever", 500);
        p2.addRecord("Prescribed paracetamol");

        HospitalBilling.processPatient(p1);
        HospitalBilling.processPatient(p2);
	}

}
