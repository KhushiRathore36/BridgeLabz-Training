package Arrays;
import java.util.*;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] tables = new int[10];

        
        for (int i = 1; i <= 10; i++) {
            tables[i - 1] = num * i;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + tables[i - 1]);
        }
	}

}
