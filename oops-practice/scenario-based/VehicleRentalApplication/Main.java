package VehicleRentalApplication;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleRentalSystem rentalSystem = new VehicleRentalSystem();

        
        Vehicle v1 = new Bike("B101", "Yamaha", 500);
        Vehicle v2 = new Car("C201", "Honda", 1200);
        Vehicle v3 = new Truck("T301", "Tata", 2000);

        rentalSystem.addVehicle(v1);
        rentalSystem.addVehicle(v2);
        rentalSystem.addVehicle(v3);

        
        Customer c1 = new Customer("CU01", "Rohit");
        rentalSystem.addCustomer(c1);

        System.out.println("\n--- Available Vehicles ---");
        rentalSystem.displayVehicles();

        System.out.println("\n--- Registered Customers ---");
        rentalSystem.displayCustomers();

        System.out.println("\n--- Rent Calculation for 3 Days ---");
        System.out.println(v1.getBrand() + " Rent: ₹" + v1.calculateRent(3));
        System.out.println(v2.getBrand() + " Rent: ₹" + v2.calculateRent(3));
        System.out.println(v3.getBrand() + " Rent: ₹" + v3.calculateRent(3));
	}

}
