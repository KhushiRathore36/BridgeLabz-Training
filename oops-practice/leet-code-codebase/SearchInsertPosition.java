package Leetcode;
import java.util.*;
public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++) {
        	nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(searchInsert(nums,target));
	}
	public static int searchInsert(int[] nums, int target) {
	    int left=0;
	    int right=nums.length-1;
	    while(left<right) {
	    	int mid=(left+right)/2;
	    	if(nums[mid]==target) {
	    		return mid;
	    	}
	    	else if(nums[mid]>target) {
	    		right=mid;
	    	}
	    	else {
	    		left=mid+1;
	    	}
	    }
	    return left;

	}
}
