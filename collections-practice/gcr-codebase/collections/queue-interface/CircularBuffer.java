package QueueInterface;

public class CircularBuffer {
	private int[] buffer;
    private int head = 0;
    private int tail = 0;
    private int count = 0;
    private int capacity;

    public CircularBuffer(int size) {
        this.capacity = size;
        this.buffer = new int[size];
    }

    
    public void add(int value) {
        buffer[tail] = value;
        tail = (tail + 1) % capacity;

        if (count == capacity) {
            
            head = (head + 1) % capacity;
        } else {
            count++;
        }
    }

    
    public void printBuffer() {
        System.out.print("[");
        for (int i = 0; i < count; i++) {
            int index = (head + i) % capacity;
            System.out.print(buffer[index] + (i < count - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.printBuffer(); 

        cb.add(4);       
        cb.printBuffer(); 
    }
}
