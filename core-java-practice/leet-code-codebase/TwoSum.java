package leetcodeCodebase;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int length=sc.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<length;i++){
           arr[i]=sc.nextInt();
        }
        // after that calling the helper function
        System.out.println(helper(arr,target));
	}
	public static int[] helper(int[] nums, int target) {
        int result[]=new int[2];
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=target-nums[i];
            if(mp.containsKey(num)){
                result[0]=mp.get(num);
                result[1]=i;
            }
            mp.put(nums[i],i);
        }
        return result;
    }
}
