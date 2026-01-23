package QueueInterface;
import java.util.*;
public class HospitalTriage {
	static class Patient {
        String name;
        int severity;

        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(
            (p1, p2) -> Integer.compare(p2.severity, p1.severity)
        );

        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));

       
        while (!triageQueue.isEmpty()) {
            Patient p = triageQueue.poll();
            System.out.println("Treating: " + p.name + " (Severity: " + p.severity + ")");
        }
    }
}
