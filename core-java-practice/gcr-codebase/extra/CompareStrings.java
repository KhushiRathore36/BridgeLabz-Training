package Extras;
import java.util.*;
public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String sample=sc.next();
        String sample1=sc.next();
        int result=0;
        int minLength=(sample.length()<sample1.length()?sample.length():sample1.length());
        for(int i=0;i<minLength;i++) {
        	if(sample.charAt(i)!=sample1.charAt(i)) {
        		result=sample.charAt(i)-sample1.charAt(i);
        		break;
        	}
        }
        if(result==0) {
        	System.out.println("both the string are same");
        	
        }
        else if(result<0) {
        	System.out.println("string1 comes befor string2");
        }
        else {
        	System.out.println("string2 comes befor string1");
        }
	}

}
