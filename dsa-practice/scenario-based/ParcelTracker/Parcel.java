package ParcelTracker;

public class Parcel {
	StageNode head;

    
    void createDefaultChain() {
        head = new StageNode("Packed");
        head.next = new StageNode("Shipped");
        head.next.next = new StageNode("In Transit");
        head.next.next.next = new StageNode("Delivered");
    }

    
    void addCheckpoint(String afterStage, String newStage) {
        StageNode temp = head;

        while (temp != null && !temp.stage.equals(afterStage)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found!");
            return;
        }

        StageNode checkpoint = new StageNode(newStage);
        checkpoint.next = temp.next;
        temp.next = checkpoint;

        System.out.println("Checkpoint added: " + newStage + " after " + afterStage);
    }

   
    void track() {
        if (head == null) {
            System.out.println("Parcel Lost! No stages available.");
            return;
        }

        StageNode temp = head;
        System.out.println("Tracking Parcel:");
        while (temp != null) {
            System.out.println(" -> " + temp.stage);
            temp = temp.next;
        }
    }

   
    void markLostAfter(String stageName) {
        StageNode temp = head;
        while (temp != null && !temp.stage.equals(stageName)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found!");
            return;
        }
        temp.next = null;
        System.out.println("Parcel marked lost after stage: " + stageName);
    }
}
