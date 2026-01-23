package QueueInterface;
import java.util.*;
public class ReverseAQueue {
	public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

       
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        reverse(queue);

        System.out.println(queue); 
    }
}
