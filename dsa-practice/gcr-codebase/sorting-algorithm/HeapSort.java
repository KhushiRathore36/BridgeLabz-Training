package Sorting;
import java.util.*;
public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int salaries[]=new int[n];
		for(int i=0;i<n;i++) {
			salaries[i]=sc.nextInt();
		}

		heapSort(salaries);

        System.out.println("Sorted Salary Demands (Ascending):");
        for (int sal : salaries) {
            System.out.print(sal + " ");
        }
	}
	public static void heapSort(int[] arr) {
        int n = arr.length;

        
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

       
        for (int i = n - 1; i > 0; i--) {
            
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

          
            heapify(arr, i, 0);
        }
    }
	public static void heapify(int[] arr, int heapSize, int i) {
        int largest = i;       
        int left = 2 * i + 1;  
        int right = 2 * i + 2; 

        
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }

       
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }

        
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            
            heapify(arr, heapSize, largest);
        }
    }
}
