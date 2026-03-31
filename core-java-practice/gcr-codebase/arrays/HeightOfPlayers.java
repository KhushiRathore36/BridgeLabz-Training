package Arrays;
import java.util.*;
public class HeightOfPlayers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double sum=0.0;
        Scanner sc=new Scanner(System.in);
        double height[]=new double[11];
        for(int i=0;i<11;i++) {
        	height[i]=sc.nextDouble();
        	sum+=height[i];
        }
        System.out.println("Mean of height "+sum/11);
	}

}
