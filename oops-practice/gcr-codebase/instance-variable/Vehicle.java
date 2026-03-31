package OPPSProblem;

public class Vehicle {
	String ownerName;
    String vehicleType;

    
    static double registrationFee = 5000;

    
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

   
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        
    }

   
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle1 = new Vehicle("Rohan", "Car");
        Vehicle vehicle2 = new Vehicle("Anita", "Bike");

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(6500);

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
	}

}
