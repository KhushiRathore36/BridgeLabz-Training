package Extras;
import java.util.*;
public class MostFrequentCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<str.length();i++) {
        	if(mp.containsKey(str.charAt(i))) {
        		int val=mp.get(str.charAt(i));
        		mp.put(str.charAt(i), val+1);
        	}
        	else {
        		mp.put(str.charAt(i),1);
        	}
        }
        int freq=0;
        for(Character key: mp.keySet()) {
        	if(mp.get(key)>freq) {
        		freq=mp.get(key);
        	}
        }
        for(Character key: mp.keySet()) {
        	if(mp.get(key)==freq) {
        		System.out.println("Most Frequent Character: "+mp.get(key));
        	}
        }
	}

}
