package Collections;
import java.util.*;
public class SymmetricDifference {

	 public static void main(String[] args) {
	        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
	        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

	        System.out.println(symmetricDifference(set1, set2)); 
	  }

	  public static <T> Set<T> symmetricDifference(Set<T> a, Set<T> b) {
	        Set<T> union = new HashSet<>(a);
	        union.addAll(b);

	        Set<T> intersection = new HashSet<>(a);
	        intersection.retainAll(b);

	        union.removeAll(intersection);
	        return union;
	  }

}
