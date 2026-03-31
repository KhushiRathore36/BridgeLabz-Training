package Sorting;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int marks[]=new int[n];
        for(int i=0;i<n;i++) {
        	marks[i]=sc.nextInt();
        }
        bubbleSort(marks);
	}
	public static void bubbleSort(int marks[]) {
		for(int i=0;i<marks.length;i++) {
			int val=marks[i];
			for(int j=i+1;j<marks.length;j++) {
				if(val>marks[j]) {
					int temp=marks[j];
					marks[j]=val;
					marks[i]=temp;
				}
			}
		}
		System.out.println("Arrays after sorting: ");
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+" ");
		}
	}

}
