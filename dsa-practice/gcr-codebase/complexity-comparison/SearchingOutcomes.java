package Complexity;
import java.util.*;
public class SearchingOutcomes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] datasetSizes = {1000, 10000, 1_000_000};
        Random rand = new Random();

        for (int N : datasetSizes) {
            int[] data = new int[N];

          
            for (int i = 0; i < N; i++) {
                data[i] = rand.nextInt(N);
            }

           
            int target = data[rand.nextInt(N)];

            // Linear Search 
            long startLinear = System.nanoTime();
            linearSearch(data, target);
            long endLinear = System.nanoTime();
            long linearTime = endLinear - startLinear;

           
            Arrays.sort(data);

            // Binary Search
            long startBinary = System.nanoTime();
            binarySearch(data, target);
            long endBinary = System.nanoTime();
            long binaryTime = endBinary - startBinary;

           
            System.out.println("Dataset Size: " + N);
            System.out.println("Linear Search:  " + linearTime / 1_000_000.0 + " ms");
            System.out.println("Binary Search:  " + binaryTime / 1_000_000.0 + " ms");
            System.out.println("----------------------------------------");
        }
	}
	public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
	public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
