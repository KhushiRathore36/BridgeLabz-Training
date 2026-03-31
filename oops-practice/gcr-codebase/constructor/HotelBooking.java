package OPPSProblem;

public class HotelBooking {
    String guestName;
    String roomType;
    boolean nights;
    HotelBooking(String guestName,String roomType,boolean nights){
    	this.guestName=guestName;
    	this.roomType=roomType;
    	this.nights=nights;
    }
    HotelBooking(){
    	this.guestName="Khushi Rathore";
    	this.roomType="single room";
    	this.nights=false;
    }
    HotelBooking(HotelBooking clonedHotelDetails){
    	this.guestName=clonedHotelDetails.guestName;
    	this.roomType= clonedHotelDetails.roomType;
    	this.nights= clonedHotelDetails.nights;
    }
    public void display() {
    	System.out.println("The guest name is: "+guestName);
    	System.out.println("The guest roomType is: "+roomType);
    	if(nights) {
    		System.out.println("the guest want night stay");
    	}
    	else {
    		System.out.println("the guest does not want night stay");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HotelBooking hotel=new HotelBooking();
        HotelBooking hotel1=new HotelBooking("hello","hello1",true);
        HotelBooking hotel2=new HotelBooking(hotel1);
        hotel.display();
        hotel1.display();
        hotel2.display();
	}

}
