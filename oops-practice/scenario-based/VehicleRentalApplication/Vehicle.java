package VehicleRentalApplication;

public abstract class Vehicle implements IRentable {
	 protected String vehicleId;
	 protected String brand;
	 protected double rentPerDay;
	 public Vehicle(String vehicleId, String brand, double baseRentPerDay) {
	        this.vehicleId = vehicleId;
	        this.brand = brand;
	        this.rentPerDay = baseRentPerDay;
	 }

	 public String getVehicleId() { return vehicleId; }
	 public String getBrand() { return brand; }
	 public double getBaseRentPerDay() { 
		 return rentPerDay; 
     }

	 public void displayInfo() {
	    System.out.println("ID: " + vehicleId + ", Brand: " + brand + ", Base Rent/Day: " + rentPerDay);
	 }
}
