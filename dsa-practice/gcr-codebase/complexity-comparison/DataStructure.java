package Complexity;
import java.util.*;
public class DataStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sizes = {1000, 100000, 1000000};
        Random random = new Random();

        for (int size : sizes) {
            System.out.println("\n=== Dataset Size: " + size + " ===");

            // Generate random data
            int[] array = new int[size];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            for (int i = 0; i < size; i++) {
                int num = random.nextInt(size * 10);
                array[i] = num;
                hashSet.add(num);
                treeSet.add(num);
            }

           
            int target = -1;

            // Array Search 
            long startArray = System.currentTimeMillis();
            boolean foundArray = false;
            for (int value : array) {
                if (value == target) {
                    foundArray = true;
                    break;
                }
            }
            long endArray = System.currentTimeMillis();

            // HashSet Search 
            long startHash = System.currentTimeMillis();
            boolean foundHash = hashSet.contains(target);
            long endHash = System.currentTimeMillis();

            // TreeSet Search 
            long startTree = System.currentTimeMillis();
            boolean foundTree = treeSet.contains(target);
            long endTree = System.currentTimeMillis();

            System.out.println("Array Search Time   : " + (endArray - startArray) + " ms");
            System.out.println("HashSet Search Time : " + (endHash - startHash) + " ms");
            System.out.println("TreeSet Search Time : " + (endTree - startTree) + " ms");
        }
	}

}
