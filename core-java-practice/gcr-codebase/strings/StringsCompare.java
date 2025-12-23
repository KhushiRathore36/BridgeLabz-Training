package Strings;
import java.util.*;
public class StringsCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String strSample=sc.next();
		String strSample2=sc.next();
		if(isEqual(strSample,strSample2)) {
			if(strSample.equals(strSample2)) {
				System.out.println("the result of both method is same");
			}
			
		}
		else {
			System.out.println("both the string is not same");
		}

	}
	public static boolean isEqual(String strSample,String strSample2) {
		while(strSample.length()!=0 && strSample2.length()!=0) {
			if(strSample.charAt(0)!=strSample2.charAt(0)) {
				return false;
			}
			strSample=strSample.substring(1);
			strSample2=strSample2.substring(1);
		}
		if(strSample.length()!=0) {
			return false;
		}
		if(strSample2.length()!=0) {
			return false;
		}
		return true;
	}

}
