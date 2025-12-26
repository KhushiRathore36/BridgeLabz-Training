package Extras;
import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String duplicateFreeString=removeDuplicate(str);
        System.out.println("The duplcate free string is "+duplicateFreeString);
	}
    public static String removeDuplicate(String str) {
    	HashMap<Character,Integer> mp=new HashMap<>();
    	String temp="";
    	for(int i=0;i<str.length();i++) {
    		if(!mp.containsKey(str.charAt(i))) {
    			temp=temp+str.charAt(i);
    		}
    		mp.put(str.charAt(i),1);
    	}
    	return temp;
    }
}
