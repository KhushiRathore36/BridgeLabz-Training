package Leetcode;
import java.util.*;
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String strs[]=new String[n];
        for(int i=0;i<n;i++) {
        	strs[i]=sc.next();
        }
        System.out.println(longestCommonPrefix(strs));
	}
	public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;
       
       String result = strs[0];
      
      
       for(int i = 1; i < n; i++){
           
            while(strs[i].indexOf(result) != 0){
              
               
                result = result.substring(0, result.length()-1);
              
               
                if(result.isEmpty()){
                    return "";
                }
            }
        }
        return result;

    }

}
