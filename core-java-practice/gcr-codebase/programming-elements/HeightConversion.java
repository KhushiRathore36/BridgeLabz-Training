package leetcodeBase;
import java.util.*;
public class HeightConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int height=105;
        double formula_cm=1/2.54;
        double inches=height*formula_cm;
        double formula_inches=1.0/12;
        double feet=inches*formula_inches;
        System.out.println(" Your Height in cm is "+height+" while in feet is "+feet+"  and inches is "+inches);
	}

}
