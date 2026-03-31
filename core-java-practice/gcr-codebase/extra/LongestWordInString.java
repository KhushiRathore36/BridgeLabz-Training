package Extras;
import java.util.*;
public class LongestWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split("\\s+");
        int index=0;
        String temp="";
        for(int i=0;i<arr.length;i++) {
        	if(temp.length()<arr[i].length()) {
        		index=i;
        		temp=arr[i];
        	}
        }
        System.out.println("The longest word in a string is "+arr[index]);
	}

}
