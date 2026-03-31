package Inheritance;

public class VehicleManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle ev = new ElectricVehicle(160, "Tesla Model 3");
        Vehicle pv = new PetrolVehicle(180, "Honda City");

        ev.displayVehicleInfo();
        ((ElectricVehicle) ev).charge();
        System.out.println();

        pv.displayVehicleInfo();
        ((PetrolVehicle) pv).refuel();
	}

}
interface Refuelable {
    void refuel();
}


class Vehicle {
    int maxSpeed;
    String model;

    
    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void displayVehicleInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}


class ElectricVehicle extends Vehicle {

    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println("Electric vehicle is charging.");
    }
}


class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Petrol vehicle is being refueled.");
    }
}
