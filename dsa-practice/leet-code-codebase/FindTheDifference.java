import java.util.Scanner;

public class FindTheDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        System.out.println(findTheDifference(s, t));
	}
	public static char findTheDifference(String s, String t) {
        char c=0;
        for(int i=0;i<s.length();i++){
            c ^=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            c^=t.charAt(i);
        }
        return c;
    }
}
