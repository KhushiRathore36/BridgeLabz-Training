package TrafficManager;

public class WaitingQueue {
	Vehicle front, rear;
    int size, capacity;

    WaitingQueue(int cap) {
        this.capacity = cap;
        this.size = 0;
        front = rear = null;
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(int carNo) {
        if (isFull()) {
            System.out.println("Queue Overflow! Car " + carNo + " cannot wait.");
            return;
        }

        Vehicle newCar = new Vehicle(carNo);
        if (isEmpty()) {
            front = rear = newCar;
        } else {
            rear.next = newCar;
            rear = newCar;
        }
        size++;
        System.out.println("Car " + carNo + " added to waiting queue.");
    }

    Integer dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! No cars waiting.");
            return null;
        }

        int carNo = front.number;
        front = front.next;
        size--;

        if (front == null)
            rear = null;

        return carNo;
    }
}
