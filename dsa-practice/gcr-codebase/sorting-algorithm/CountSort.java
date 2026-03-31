package Sorting;
import java.util.*;
public class CountSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		int ages[]=new int[n];
		for(int i=0;i<n;i++) {
			ages[i]=sc.nextInt();
		}

		countingSort(ages);

        
        for (int age : ages) {
            System.out.print(age + " ");
        } 
	}
	public static void countingSort(int[] ages) {
        int min = 10;
        int max = 18;
        int range = max - min + 1;

        int n = ages.length;
        int[] count = new int[range];
        int[] output = new int[n];

        
        for (int age : ages) {
            count[age - min]++;
        }

       
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

       
        for (int i = n - 1; i >= 0; i--) {
            output[count[ages[i] - min] - 1] = ages[i];
            count[ages[i] - min]--;
        }

       
        System.arraycopy(output, 0, ages, 0, n);
    }
}
