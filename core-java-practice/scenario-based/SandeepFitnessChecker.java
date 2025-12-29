package ScenarioBased;
import java.util.*;
public class SandeepFitnessChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int pushup[]=new int[7];
        int count=0;
        for(int i=0;i<pushup.length;i++) {
        	pushup[i]=sc.nextInt();
        	if(pushup[i]!=0) {
        		count+=pushup[i];
        	}
        	else {
        		continue;
        		
        	}
        }
        double average=count/7.0;
        System.out.println("the total pushup in a week is "+count);
        System.out.println("the average pushup in a week is "+average);

	}

}
