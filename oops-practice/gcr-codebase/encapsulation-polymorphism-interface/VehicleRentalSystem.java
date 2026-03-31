package Encapsulation;
import java.util.ArrayList;
import java.util.List;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public abstract double calculateRentalCost(int days);

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    protected double getRentalRate() {
        return rentalRate;
    }

    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }
}

class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance";
    }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9;
    }

    @Override
    public double calculateInsurance() {
        return 200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance";
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5;
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance";
    }
}

public class VehicleRentalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 2000, "CAR-INS-01"));
        vehicles.add(new Bike("BIKE202", 800, "BIKE-INS-02"));
        vehicles.add(new Truck("TRUCK303", 5000, "TRUCK-INS-03"));

        int days = 3;

        for (Vehicle v : vehicles) {
            double rentalCost = v.calculateRentalCost(days);
            double insurance = 0;

            if (v instanceof Insurable) {
                insurance = ((Insurable) v).calculateInsurance();
            }

            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Type: " + v.getType());
            System.out.println("Rental Cost: ₹" + rentalCost);
            System.out.println("Insurance Cost: ₹" + insurance);
            System.out.println("Total Cost: ₹" + (rentalCost + insurance));
            
        }
	}

}
