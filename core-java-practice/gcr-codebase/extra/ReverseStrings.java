package Extras;
import java.util.*;
public class ReverseStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String temp="";
        for(int i=str.length()-1;i>=0;i--) {
        	temp=temp+str.charAt(i);
        	
        }
        System.out.println("The reverse string is "+temp);
	}

}
