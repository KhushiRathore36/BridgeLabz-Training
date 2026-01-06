package Encapsulation;
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class Vehicle implements GPS {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = "Unknown";
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: ₹" + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    protected double getRatePerKm() {
        return ratePerKm;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}

class Car extends Vehicle {
    public Car(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50;
    }
}

class Bike extends Vehicle {
    public Bike(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

class Auto extends Vehicle {
    public Auto(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20;
    }
}

class FareCalculator {
    public static void calculateRideFare(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: ₹" + vehicle.calculateFare(distance));
        
    }
}
public class RideHailingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Car(1, "Rohit", 15);
        Vehicle bike = new Bike(2, "Aman", 8);
        Vehicle auto = new Auto(3, "Suresh", 10);

        car.updateLocation("Sector 21");
        bike.updateLocation("Railway Station");
        auto.updateLocation("City Center");

        FareCalculator.calculateRideFare(car, 10);
        FareCalculator.calculateRideFare(bike, 5);
        FareCalculator.calculateRideFare(auto, 7);
	}

}
