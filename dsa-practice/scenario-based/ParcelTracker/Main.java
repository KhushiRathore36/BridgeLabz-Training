package ParcelTracker;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel parcel = new Parcel();

        parcel.createDefaultChain();

        parcel.track();

        parcel.addCheckpoint("In Transit", "Custom Checkpoint: Bangalore Hub");

        parcel.track();

        parcel.markLostAfter("Shipped");

        parcel.track();
	}

}
