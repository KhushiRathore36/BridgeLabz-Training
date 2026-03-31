package leetcodeBase;
import java.util.*;
public class RemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scannner sc=new Scanner(System.in);
		int val=sc.nextInt();
		int length=sc.nextInt();
		int nums[]=new int[length];
		for(int i=0;i<length;i++){
			nums[i]=sc.nextInt();
		}
		System.out.println(removeElement(nums,val));
	}
    public static int removeElement(int[] nums, int val) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[n]=nums[i];
                n++;
            }
        }
        return n;
    }
}
