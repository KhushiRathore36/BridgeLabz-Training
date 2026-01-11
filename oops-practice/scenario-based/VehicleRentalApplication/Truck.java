package VehicleRentalApplication;

public class Truck extends Vehicle{
	public Truck(String vehicleId, String brand, double rentPerDay) {
        super(vehicleId, brand, rentPerDay);
    }

    @Override
    public double calculateRent(int days) {
        return (rentPerDay * days) + 1000; // higher load charge
    }
}
