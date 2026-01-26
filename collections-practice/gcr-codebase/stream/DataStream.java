package Stream;
import java.io.*;
public class DataStream {
	public static void main(String[] args) {
        String filename = "students.dat";

       
        int roll = 101;
        String name = "Khushi";
        double gpa = 9.1;

        writeStudentData(filename, roll, name, gpa);

        
        readStudentData(filename);
    }

  
    public static void writeStudentData(String filename, int roll, String name, double gpa) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeInt(roll);
            dos.writeUTF(name);
            dos.writeDouble(gpa);
            System.out.println("Student data written successfully!");
        } catch (IOException e) {
            System.out.println("Write Error: " + e.getMessage());
        }
    }

    
    public static void readStudentData(String filename) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("\nRetrieved Student Data:");
            System.out.println("Roll No: " + roll);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        } catch (IOException e) {
            System.out.println("Read Error: " + e.getMessage());
        }
    }
}
