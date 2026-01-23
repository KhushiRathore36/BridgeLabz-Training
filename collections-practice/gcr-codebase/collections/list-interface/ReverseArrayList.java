package Collections;
import java.util.*;
public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l);
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<l.size();i++) {
        	ans.add(l.get(l.size()-1-i));
        }
        System.out.println(ans);
	}

}
