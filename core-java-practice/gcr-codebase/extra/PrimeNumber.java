package Extras;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isPrime(num)) {
        	System.out.println("the number is prime number");
        }
        else {
        	System.out.println("the number is not a prime number");
        }
	}
	public static boolean isPrime(int num) {
		int count=1;
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count>2) {
			return false;
		}
		return true;
	}

}
