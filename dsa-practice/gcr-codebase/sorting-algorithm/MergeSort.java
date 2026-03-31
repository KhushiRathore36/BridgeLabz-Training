package Sorting;
import java.util.*;
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++) {
        	prices[i]=sc.nextInt();
        }
        mergeSort(prices,0,prices.length-1);
        System.out.println("Arrays after sorting: ");
        for(int i=0;i<n;i++) {
        	System.out.print(prices[i]+" ");
        }
        
	}
	public static void mergeSort(int prices[],int left,int right) {
		if (left < right) {
            int mid = (left + right) / 2;

            
            mergeSort(prices, left, mid);

            
            mergeSort(prices, mid + 1, right);

           
            merge(prices, left, mid, right);
        }
	}
	public static void merge(int[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        
        int[] temp = new int[n1];
        int[] temp1 = new int[n2];

        
        for (int i = 0; i < n1; i++) temp[i] = prices[left + i];
        for (int i = 0; i < n2; i++) temp1[i] = prices[mid + 1 + i];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (temp[i] <= temp1[j]) {
                prices[k] = temp[i];
                i++;
            } else {
                prices[k] = temp1[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            prices[k] = temp[i];
            i++;
            k++;
        }

        while (j < n2) {
            prices[k] = temp1[j];
            j++;
            k++;
        }
    }


}
