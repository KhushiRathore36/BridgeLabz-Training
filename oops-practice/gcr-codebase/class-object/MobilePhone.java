package OPPSProblem;

public class MobilePhone {
    String brand;
    String model;
    double price;
    MobilePhone(String brand,String model,double price){
    	this.brand=brand;
    	this.model=model;
    	this.price=price;
    }
    public void display() {
    	System.out.println("Brand of mobile:: "+brand);
    	System.out.println("Model of mobile:: "+model);
    	System.out.println("price of mobile:: "+price);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MobilePhone mobile=new MobilePhone("VIVO", "VIVO V29",15999.0);
        MobilePhone mobile1=new MobilePhone("ONE PLUS", "ONE PLUS nord4",39999.0);
        MobilePhone mobile2=new MobilePhone("APPLE", "iphone pro16",79999.0);
        mobile.display();
        mobile1.display();
        mobile2.display();
	}

}
