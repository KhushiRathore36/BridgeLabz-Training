package Sorting;
import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int scores[]=new int[n];
		for(int i=0;i<n;i++) {
			scores[i]=sc.nextInt();
		}

        selectionSort(scores);

        System.out.println("Arrays after sort:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
	}
	public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            
            int minIndex = i;

            
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

         
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
	}
}
