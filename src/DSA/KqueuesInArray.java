package DSA;

public class KqueuesInArray {

    int[] arr; // Main array to store elements
    int[] front; // Stores front indices of k queues
    int[] rear; // Stores rear indices of k queues
    int[] next; // Stores next available slot
    int free; // Tracks the first free index

    public KqueuesInArray(int n, int k) {
        arr = new int[n];
        front = new int[k];
        rear = new int[k];
        next = new int[n];
        free = 0;

        // Initialize front and rear
        for (int i = 0; i < k; i++) {
            front[i] = -1;
            rear[i] = -1;
        }

        // Initialize next array
        for (int i = 0; i < n - 1; i++) {
            next[i] = i + 1;
        }
        next[n - 1] = -1;
    }

    public void enqueue(int item, int qn) {
        // Check if space is available
        if (free == -1) {
            System.out.println("Queue overflow");
            return;
        }

        int i = free; // Get the first free index
        free = next[i]; // Update free slot

        // If queue is empty, update front
        if (front[qn] == -1) {
            front[qn] = i;
        } else {
            next[rear[qn]] = i; // Link new element to previous rear
        }

        next[i] = -1; // Mark end of queue
        rear[qn] = i; // Update rear
        arr[i] = item; // Store the element
    }

    public int dequeue(int qn) {
        if (front[qn] == -1) {
            System.out.println("Queue underflow");
            return -1;
        }

        int i = front[qn]; // Get front index
        front[qn] = next[i]; // Update front pointer

        next[i] = free; // Link this slot to free list
        free = i; // Update free index

        return arr[i]; // Return dequeued element
    }

    public static void main(String[] args) {
        int n = 10, k = 3;
        KqueuesInArray kQueues = new KqueuesInArray(n, k);

        kQueues.enqueue(15, 0);
        kQueues.enqueue(25, 0);
        kQueues.enqueue(35, 1);

        System.out.println("Dequeued from queue 0: " + kQueues.dequeue(0));
        System.out.println("Dequeued from queue 1: " + kQueues.dequeue(1));
    }
}
