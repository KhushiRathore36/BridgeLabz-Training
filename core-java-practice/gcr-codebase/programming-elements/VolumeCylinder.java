package leetcodeCodebase;
import java.util.*;
public class VolumeCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		int radius=sc.nextInt();
		int height=sc.nextInt();
		int result=(int) Math.pow(radius,2);
		float volume=3.14f*result*height;
		System.out.println("The volume of Cylinder is "+volume);
	}

}
