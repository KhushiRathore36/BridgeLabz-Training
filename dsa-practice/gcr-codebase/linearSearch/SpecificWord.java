package LinearSearch;
import java.util.*;
public class SpecificWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("write the whole sentence: ");
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextLine();
        }
        
        System.out.println("write the word that you want to find in the sentence: ");
        String word=sc.next();
        for(int i=0;i<n;i++) {
        	String line=arr[i];
        	if(line.contains(word)) {
        		System.out.println(line);
        		break;
        	}
        }
        
        
	}

}
