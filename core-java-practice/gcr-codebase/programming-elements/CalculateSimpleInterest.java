package leetcodeCodebase;
import java.util.*;
public class CalculateSimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		int principal=sc.nextInt();
		int rate=sc.nextInt();
		int time=sc.nextInt();
		int SI=(principal * rate*time)/100;
		System.out.println(SI);
	}

}
