package Extras;
import java.util.*;
public class RemoveSpecificCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str="hello world";
       char ch=sc.next().charAt(0);
       
        String temp="";
        for(int i=0;i<str.length();i++) {
        	if(ch!=str.charAt(i)) {
        		temp=temp+str.charAt(i);
        	}
        }
        System.out.println(temp);
	}

}
