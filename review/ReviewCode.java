package Methods;
import java.util.*;
public class ReviewCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int zeroCount=0;
        int oneCount=0;
        int twoCount=0;
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        	if(arr[i]==0) {
        		zeroCount++;
        	}
        	else if(arr[i]==1) {
        		oneCount++;
        	}
        	else {
        		twoCount++;
        	}
        }
        int result[]=new int[n];
        int l=0;
        while(zeroCount>0) {
        	result[l++]=0;
        	zeroCount--;
        }
        while(oneCount>0) {
        	result[l++]=1;
        	oneCount--;
        }
        while(twoCount>0) {
        	result[l++]=2;
        	twoCount--;
        }
        for(int i=0;i<n;i++) {
        	System.out.print(result[i]+" ");
        }
	}

}
