package LeetcodeProblem;
import java.util.*;
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++) {
        	nums[i]=sc.nextInt();
        }
        System.out.println("Reversing the array:");
        for(int i=0;i<n;i++) {
        	System.out.print(nums[i]+" ");
        }
        
	}
	public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
