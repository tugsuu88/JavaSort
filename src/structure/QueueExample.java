package structure;
import java.util.*;

public class QueueExample {
    public static void PriorityQueueExample() {
        // Creating empty priority queue
        Queue<Integer> pQueue
                = new PriorityQueue<Integer>();

        // Adding items to the pQueue
        // using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        // Printing the top element of
        // the PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());

        // Printing the top element again
        System.out.println(pQueue.peek());


    }

    public static void LinkedListExample() {
        // Creating empty LinkedList
        Queue<Integer> ll
                = new LinkedList<Integer>();

        // Adding items to the ll
        // using add()
        ll.add(10);
        ll.add(20);
        ll.add(15);

        // Printing the top element of
        // the LinkedList
        System.out.println(ll.peek());

        // Printing the top element and removing it
        // from the LinkedList container
        System.out.println(ll.poll());

        // Printing the top element again
        System.out.println(ll.peek());
    }
}
