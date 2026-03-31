package Arrays;
import java.util.*;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number<1) {
        	System.out.println("Sorry type the number again!");
        }
        else {
        	int size=number/2+1;
        	int even[]=new int[size];
        	int odd[]=new int[size];
        	int e=0;
        	int o=0;
        	for(int i=1;i<=number;i++) {
        		if(i%2==0) {
        			even[e++]=i;
        		}
        		else {
        			odd[o++]=i;
        		}
        	}
        	System.out.println(even);
        	System.out.println(odd);
        }
	}

}
