package StringBuffer;
import java.util.*;
public class ConcatenateStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a length of the string array: ");
        int len=sc.nextInt();
        StringBuffer sf=new StringBuffer();
        String arr[]=new String[len];
        for(int i=0;i<len;i++) {
        	arr[i]=sc.next();
        	sf.append(arr[i]);
        	sf.append(" ");
        }
        System.out.println(sf);
        
	}

}
