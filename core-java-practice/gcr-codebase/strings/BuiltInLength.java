package Strings;
import java.util.*;
public class BuiltInLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;
        try {
        	while(true) {
        		str.charAt(count);
        		count++;
        	}
        }catch(StringIndexOutOfBoundsException e){
        	
        }
        System.out.println("the length of the string str is "+count);
        System.out.println("the length using built-in function "+str.length());
	}

}
