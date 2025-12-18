package leetcodeBase;
import java.util.*;
public class Handshakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int number_Of_Students = sc.nextInt();
        int handshakes = (number_Of_Students * (number_Of_Students - 1)) / 2;
        System.out.println("The number of possible handshakes is "+handshakes);
	}

}
