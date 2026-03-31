package Methods;
import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        int rate=sc.nextInt();
        int time=sc.nextInt();
        double principal=sc.nextDouble();
        calculateSimpleInterest(rate,time,principal);
	}
	public static void calculateSimpleInterest(int rate,int time,double principal) {
		double simpleInterest=principal*rate*time/100.0;
		System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+" , Rate of Interest "+rate+" and Time "+time);
	}

}
