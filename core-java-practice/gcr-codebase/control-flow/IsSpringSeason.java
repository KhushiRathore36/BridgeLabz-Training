package leetcodeBase;
import java.util.*;
public class IsSpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int date=sc.nextInt();
        int month=sc.nextInt();
        if ((month == 3 && date >= 20) ||(month == 4) ||(month == 5) ||(month == 6 && date <= 20)) {
             System.out.println("Its a Spring Season");
        } else {
             System.out.println("Not a Spring Season");
        }
	}

}
