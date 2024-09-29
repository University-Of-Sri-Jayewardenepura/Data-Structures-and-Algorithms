import java.util.PriorityQueue;
import java.util.Comparator;

class PriorityQueueStructure {
    public static void main(String[] args) {
        // Default PriorityQueue (Min-Heap)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Adding elements to min-heap
        minHeap.add(30);
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(40);
        minHeap.add(50);

        // Poll operation (removes and returns the smallest element)
        System.out.println("Removed element: " + minHeap.poll()); // Removes 10

        // Peek operation (retrieves the smallest element without removing)
        System.out.println("Front element: " + minHeap.peek()); // Should be 20

        // Size of the priority queue
        System.out.println("Priority Queue size: " + minHeap.size());

        // Check if the priority queue is empty
        System.out.println("Is Priority Queue empty? " + minHeap.isEmpty());

        // Iterate through the priority queue
        System.out.print("Elements in Priority Queue: ");
        for (int num : minHeap) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Creating a Max-Heap using a Comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        // Adding elements to max-heap
        maxHeap.add(30);
        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(40);
        maxHeap.add(50);

        // Poll operation (removes and returns the largest element)
        System.out.println("Removed element from Max-Heap: " + maxHeap.poll()); // Removes 50

        // Peek operation (retrieves the largest element without removing)
        System.out.println("Front element in Max-Heap: " + maxHeap.peek()); // Should be 40

        // Size of the max-heap
        System.out.println("Max-Heap size: " + maxHeap.size());

        // Check if the max-heap is empty
        System.out.println("Is Max-Heap empty? " + maxHeap.isEmpty());

        // Iterate through the max-heap
        System.out.print("Elements in Max-Heap: ");
        for (int num : maxHeap) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

// Removed element: 10
// Front element: 20
// Priority Queue size: 4
// Is Priority Queue empty? false
// Elements in Priority Queue: 20 30 40 50 
// Removed element from Max-Heap: 50
// Front element in Max-Heap: 40
// Max-Heap size: 4
// Is Max-Heap empty? false
// Elements in Max-Heap: 40 30 20 10 