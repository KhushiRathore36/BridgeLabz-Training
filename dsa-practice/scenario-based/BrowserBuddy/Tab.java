package BrowserBuddy;

public class Tab {
	HistoryNode current;

    
    void visit(String url) {
        HistoryNode newNode = new HistoryNode(url);

        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;

        System.out.println("Visited: " + url);
    }

    
    void back() {
        if (current == null || current.prev == null) {
            System.out.println("No Back History!");
            return;
        }
        current = current.prev;
        System.out.println("Back to: " + current.url);
    }

   
    void forward() {
        if (current == null || current.next == null) {
            System.out.println("No Forward History!");
            return;
        }
        current = current.next;
        System.out.println("Forward to: " + current.url);
    }

    
    void printCurrent() {
        if (current == null) System.out.println("Empty Tab!");
        else System.out.println("Current Page: " + current.url);
    }
}
