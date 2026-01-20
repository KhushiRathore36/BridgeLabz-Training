package TrafficManager;

public class TrafficManager {
	Roundabout roundabout = new Roundabout();
    WaitingQueue queue = new WaitingQueue(5);

    void addCar(int carNo) {
        if (roundabout.isEmpty()) {
            roundabout.addCar(carNo);
        } else {
            
            if (countCars() < 4) {
                roundabout.addCar(carNo);
            } else {
                queue.enqueue(carNo);
            }
        }
    }

    void releaseFromQueue() {
        Integer nextCar = queue.dequeue();
        if (nextCar != null) roundabout.addCar(nextCar);
    }

    int countCars() {
        if (roundabout.isEmpty()) return 0;
        int count = 0;
        Vehicle temp = roundabout.head;
        do {
            count++;
            temp = temp.next;
        } while (temp != roundabout.head);
        return count;
    }
}
