package Complexity;
import java.util.*;
public class SortingOutcomes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sizes = {1000, 10000, 1_000_000};
        Random rand = new Random();

        System.out.println("Dataset Size\tBubble Sort\tMerge Sort\tQuick Sort");

        for (int N : sizes) {
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) arr[i] = rand.nextInt(N);

            int[] arr1 = arr.clone();
            int[] arr2 = arr.clone();
            int[] arr3 = arr.clone();

            String bubbleResult, mergeResult, quickResult;

            // Bubble Sort (skip if too large)
            if (N > 10000) {
                bubbleResult = "Unfeasible";
            } else {
                long start = System.nanoTime();
                bubbleSort(arr1);
                long end = System.nanoTime();
                bubbleResult = (end - start) / 1_000_000.0 + "ms";
            }

            // Merge Sort
            long start = System.nanoTime();
            mergeSort(arr2, 0, arr2.length - 1);
            long end = System.nanoTime();
            mergeResult = (end - start) / 1_000_000.0 + "ms";

            // Quick Sort
            start = System.nanoTime();
            quickSort(arr3, 0, arr3.length - 1);
            end = System.nanoTime();
            quickResult = (end - start) / 1_000_000.0 + "ms";

            // Print Result Row
            System.out.println(N + "\t\t" + bubbleResult + "\t" + mergeResult + "\t" + quickResult);
        }
	}
	public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; 
        }
    }
	public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
	public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int i = 0; i < n2; i++) R[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
	public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return (i + 1);
    }
}
