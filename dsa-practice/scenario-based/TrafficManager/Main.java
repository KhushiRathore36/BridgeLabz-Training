package TrafficManager;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficManager tm = new TrafficManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Car\n2. Remove Car\n3. Release from Queue\n4. Print State\n5. Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter Car No: ");
                    tm.addCar(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter Car No to Remove: ");
                    tm.roundabout.removeCar(sc.nextInt());
                    break;

                case 3:
                    tm.releaseFromQueue();
                    break;

                case 4:
                    tm.roundabout.printState();
                    break;

                case 5:
                    System.exit(0);
            }
        }
	}

}
