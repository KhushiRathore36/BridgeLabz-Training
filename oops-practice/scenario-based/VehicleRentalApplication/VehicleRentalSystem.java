package VehicleRentalApplication;
import java.util.*;
public class VehicleRentalSystem {
	private List<Vehicle> vehicles = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

    
    public void addVehicle(Vehicle v) {
        vehicles.add(v);
        System.out.println("Vehicle Added!");
    }

    public void addCustomer(Customer c) {
        customers.add(c);
        System.out.println("Customer Added!");
    }

    
    public void displayVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No Vehicles Available!");
            return;
        }
        for (Vehicle v : vehicles) v.displayInfo();
    }

    public void displayCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No Customers Found!");
            return;
        }
        for (Customer c : customers)
            System.out.println("Customer: " + c.getCustomerId() + ", Name: " + c.getName());
    }

   
    public void updateRent(String vehicleId, double newRent) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleId().equals(vehicleId)) {
                System.out.println("Rent Updated!");
                return;
            }
        }
        System.out.println("Vehicle Not Found!");
    }

   
    public void deleteVehicle(String id) {
        vehicles.removeIf(v -> v.getVehicleId().equals(id));
        System.out.println("Vehicle Deleted!");
    }
}
