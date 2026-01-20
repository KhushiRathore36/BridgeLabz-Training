import java.util.*;
public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int num1[]=new int[m];
        for(int i=0;i<m;i++) {
        	num1[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int num2[]=new int[n];
        for(int i=0;i<m;i++) {
        	num2[i]=sc.nextInt();
        }
        merge(num1,m,num2,n);
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
           if(nums1[i]>nums2[j]){
              nums1[k]=nums1[i];
              k--;
              i--;
           }
           else{
               nums1[k]=nums2[j];
               j--;
               k--;
           }
        }
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }
}
