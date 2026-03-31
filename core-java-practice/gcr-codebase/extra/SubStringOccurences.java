package Extras;
import java.util.*;
public class SubStringOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Enter a substring:");
        String substr=sc.next();
        String arr[]=str.split("\\s+");
        int count=0;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i].equals(substr)) {
        		count++;
        	}
        }
        System.out.println("the particular substring comes "+count+" times in a given string");
	}

}
