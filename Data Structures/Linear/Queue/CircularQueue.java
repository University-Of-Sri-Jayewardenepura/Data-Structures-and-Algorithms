class CircularQueueStructure {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public CircularQueueStructure(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    // Enqueue operation
    public void enqueue(int value) {
        if (nItems == maxSize) {
            System.out.println("Circular Queue is full");
        } else {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = value;
            nItems++;
        }
    }

    // Dequeue operation
    public int dequeue() {
        if (nItems == 0) {
            System.out.println("Circular Queue is empty");
            return -1;
        } else {
            int temp = queueArray[front];
            front = (front + 1) % maxSize;
            nItems--;
            return temp;
        }
    }

    // Front operation
    public int front() {
        if (nItems == 0) {
            System.out.println("Circular Queue is empty");
            return -1;
        } else {
            return queueArray[front];
        }
    }

    // isEmpty operation
    public boolean isEmpty() {
        return (nItems == 0);
    }

    // isFull operation
    public boolean isFull() {
        return (nItems == maxSize);
    }

    // Size operation
    public int size() {
        return nItems;
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        CircularQueueStructure cQueue = new CircularQueueStructure(5);
        cQueue.enqueue(10);
        cQueue.enqueue(20);
        cQueue.enqueue(30);
        cQueue.enqueue(40);
        cQueue.enqueue(50);

        // Attempt to enqueue when full
        cQueue.enqueue(60); // Should print "Circular Queue is full"

        System.out.println("Front element: " + cQueue.front());
        System.out.println("Queue size: " + cQueue.size());

        cQueue.dequeue();
        cQueue.dequeue();

        System.out.println("Front element after dequeue: " + cQueue.front());
        System.out.println("Is queue full? " + cQueue.isFull());
        System.out.println("Is queue empty? " + cQueue.isEmpty());

        // Enqueue more elements to test wrap-around
        cQueue.enqueue(60);
        cQueue.enqueue(70);

        System.out.println("Front element: " + cQueue.front());
        System.out.println("Queue size: " + cQueue.size());
    }
}

// Circular Queue is full
// Front element: 10
// Queue size: 5
// Front element after dequeue: 30
// Is queue full? false
// Is queue empty? false
// Front element: 30
// Queue size: 5