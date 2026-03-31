package Extras;
import java.util.*;
public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("the fibonacci are: ");
        printFibonacci(num); 
	}
	public static void printFibonacci(int terms) {
        int first = 0;
        int second = 1;

        

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

}
