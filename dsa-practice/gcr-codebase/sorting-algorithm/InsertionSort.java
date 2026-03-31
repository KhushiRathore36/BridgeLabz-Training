package Sorting;
import java.util.*;
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter a length of the array and then continue writing the element: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int empId[]=new int[n];
        for(int i=0;i<n;i++) {
        	empId[i]=sc.nextInt();
        }
        insertionSort(empId);
	}
	public static void insertionSort(int empId[]) {
		for(int i=1;i<empId.length;i++) {
			int val=empId[i];
			int j=i-1;
			while(j>=0 && empId[j]>val) {
				empId[j+1]=empId[j];
				j=j-1;
			}
			empId[j+1]=val;
		}
		System.out.println("Array after sorting: ");
		for(int i=0;i<empId.length;i++) {
			System.out.print(empId[i]+" ");
		}
	}

}
