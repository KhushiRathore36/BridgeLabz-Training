package LeetcodeProblem;
import java.util.*;
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Finding the missing number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++) {
        	nums[i]=sc.nextInt();
        }
        System.out.println(missingNumber(nums));
	}
	public static int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        int num_sum=0;
        for(int i=0;i<nums.length;i++){
            num_sum+=nums[i];
        }
        return sum-num_sum;
    }
}
