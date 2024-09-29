class QueueStructure {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public QueueStructure(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    // Enqueue operation
    public void enqueue(int value) {
        if (nItems == maxSize) {
            System.out.println("Queue is full");
        } else {
            if (rear == maxSize - 1) {
                rear = -1; // Wrap around
            }
            queueArray[++rear] = value;
            nItems++;
        }
    }

    // Dequeue operation
    public int dequeue() {
        if (nItems == 0) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int temp = queueArray[front++];
            if (front == maxSize) {
                front = 0; // Wrap around
            }
            nItems--;
            return temp;
        }
    }

    // Front operation
    public int front() {
        if (nItems == 0) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return queueArray[front];
        }
    }

    // isEmpty operation
    public boolean isEmpty() {
        return (nItems == 0);
    }

    // Size operation
    public int size() {
        return nItems;
    }
}

public class Queue {
    public static void main(String[] args) {
        QueueStructure queue = new QueueStructure(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.front());
        System.out.println("Queue size: " + queue.size());

        queue.dequeue();
        System.out.println("Front element after dequeue: " + queue.front());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}

// Front element: 10
// Queue size: 3
// Front element after dequeue: 20
// Is queue empty? false