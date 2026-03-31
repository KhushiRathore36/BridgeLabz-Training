package HashMap;
import java.util.*;
public class CheckPairGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(pairWithSum(arr,target));
	}
	public static boolean pairWithSum(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            int required = target - num;
            
            if (set.contains(required)) {
                return true;
            }
            
            set.add(num);
        }
        
        return false;
    }
}
