package Methods;
import java.util.*;
public class SumOfNNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(findSum(num));
        
	}
	public static int findSum(int num) {
		int sum=0;
		if(num>0) {
			for(int i=0;i<num;i++) {
				sum+=i;
			}
			
		}
		return sum;
	}

}
