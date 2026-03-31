package ScenarioBased;
import java.util.*;
public class CoffeeCounterChronicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int type=3;
        int gst=5;
        int amount;
        switch(type) {
        case 1:
        	amount=120;
        	System.out.println(totalAmount(amount,gst));
        	break;
        case 2:
            amount=150;
    	    System.out.println(totalAmount(amount,gst));
    	    break;
        case 3:
        	amount=200;
    	    System.out.println(totalAmount(amount,gst));
    	    break;
        case 4:
        	amount=250;
    	    System.out.println(totalAmount(amount,gst));
    	    break;   
        }
        
        	
        
	}
	public static String totalAmount(int amount,int gst) {
		double gstAdded=amount*gst/100.0;
		
		double total=amount+gstAdded;
		return "The total amount of your coffee is "+total;
	}

}
