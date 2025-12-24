package Methods;
import java.util.*;

public class Handshakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("the number of possible handshakes are "+possibleHandshakes(number));
	}
	public static int possibleHandshakes(int n) {
		int ans=(n*(n-1))/2;
		return ans;
	}

}
