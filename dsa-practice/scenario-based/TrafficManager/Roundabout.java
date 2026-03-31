package TrafficManager;

public class Roundabout {
	Vehicle head;

    boolean isEmpty() {
        return head == null;
    }

    
    void addCar(int carNo) {
        Vehicle newCar = new Vehicle(carNo);

        if (head == null) {
            head = newCar;
            newCar.next = head;
        } else {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newCar;
            newCar.next = head;
        }
        System.out.println("Car " + carNo + " entered the roundabout.");
    }

   
    void removeCar(int carNo) {
        if (isEmpty()) {
            System.out.println("Roundabout Underflow! No cars present.");
            return;
        }

        Vehicle temp = head, prev = null;

        if (temp.number == carNo) {
            if (temp.next == head) { 
                head = null;
            } else {
                while (temp.next != head) temp = temp.next;
                temp.next = head.next;
                head = head.next;
            }
            System.out.println("Car " + carNo + " exited the roundabout.");
            return;
        }

        temp = head;
        do {
            prev = temp;
            temp = temp.next;
        } while (temp != head && temp.number != carNo);

        if (temp.number == carNo) {
            prev.next = temp.next;
            System.out.println("Car " + carNo + " exited the roundabout.");
        } else {
            System.out.println("Car " + carNo + " not found!");
        }
    }

   
    void printState() {
        if (isEmpty()) {
            System.out.println("Roundabout Empty!");
            return;
        }

        System.out.print("Roundabout: ");
        Vehicle temp = head;
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}
