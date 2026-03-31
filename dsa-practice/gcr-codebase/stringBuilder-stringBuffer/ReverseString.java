package StringBuilder;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a actual string: ");
        String str=sc.next();
        StringBuilder sb=new StringBuilder(str);
        System.out.println("Reverse string is: ");
        System.out.println(sb.reverse());
	}

}
