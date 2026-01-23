package Collections;

public class NthElement {
	static class Node {
	    String data;
	    Node next;
	    Node(String data) { this.data = data; }
	}
	public static Node findNthFromEnd(Node head, int n) {
	    Node fast = head;
	    Node slow = head;

	   
	    for (int i = 0; i < n; i++) {
	        if (fast == null) return null; 
	        fast = fast.next;
	    }

	   
	    while (fast != null) {
	        fast = fast.next;
	        slow = slow.next;
	    }

	    return slow;
	}
	public static void main(String[] args) {
	    Node head = new Node("A");
	    head.next = new Node("B");
	    head.next.next = new Node("C");
	    head.next.next.next = new Node("D");
	    head.next.next.next.next = new Node("E");

	    Node ans = findNthFromEnd(head, 2);
	    System.out.println(ans.data); 
	}
}
