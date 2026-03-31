package leetcodeBase;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(reverseWords(s));
	}
    public static String reverseWords(String s) {
        s=s.trim();
        String arr[]=s.split("\\s+");
        String ans="";
        for(int i=arr.length-1;i>0;i--){
            ans=ans+arr[i]+" ";
        }
        ans=ans+arr[0];
        return ans;
    }
}
