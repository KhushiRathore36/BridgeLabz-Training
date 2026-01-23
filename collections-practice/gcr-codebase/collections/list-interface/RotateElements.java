package Collections;
import java.util.*;
public class RotateElements {

	public static List<Integer> rotate(List<Integer> list, int k) {
        int n = list.size();
        k = k % n;  

        List<Integer> rotated = new ArrayList<>();

       
        for (int i = k; i < n; i++) {
            rotated.add(list.get(i));
        }

       
        for (int i = 0; i < k; i++) {
            rotated.add(list.get(i));
        }

        return rotated;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> result = rotate(list, 2);

        System.out.println(result);
    }

}
