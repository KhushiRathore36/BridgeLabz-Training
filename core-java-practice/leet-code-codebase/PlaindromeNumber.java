package leetcodeBase;
import java.util.*;
public class PlaindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(isPalindrome(x));
	}
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s=x+"";
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
