import java.util.*;
public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        if(isAnagram(s,t)) {
        	System.out.println("yes!, both string is anagram");
        }
        else {
        	System.out.println("Not a anagram");
        }
	}
	public static boolean isAnagram(String s, String t) {
        int ans[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            ans[(ch-'a')]++;
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            ans[(ch-'a')]--;
        }
        for(int i=0;i<26;i++){
            if(ans[i]!=0){
                return false;
            }
        }
        return true;
    }
}
