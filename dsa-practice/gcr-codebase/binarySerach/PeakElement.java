package BinarySearch;
import java.util.*;
public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a length of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        System.out.println(findPeakElement(arr));
	}
	public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1; 
            } else {
                right = mid;    
            }
        }
        return left; 
    }
}
