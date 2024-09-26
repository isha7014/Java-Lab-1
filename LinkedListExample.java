import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Populate the LinkedList
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }

        // Access an element by index
        long startTime = System.nanoTime();
        int value = linkedList.get(500000);
        long endTime = System.nanoTime();
        System.out.println("Retrieved value: " + value);
        System.out.println("Time taken for Index Access: " + (endTime - startTime) + " nanoseconds");

        // Check if value exists
        startTime = System.nanoTime();
        boolean exists = linkedList.contains(999999);
        endTime = System.nanoTime();
        System.out.println("Value 999999 exists: " + exists);
        System.out.println("Time taken for Value Check: " + (endTime - startTime) + " nanoseconds");

        // Add an element at the beginning
        startTime = System.nanoTime();
        linkedList.addFirst(-1);
        endTime = System.nanoTime();
        System.out.println("Time taken to Add at Head: " + (endTime - startTime) + " nanoseconds");

        // Add an element in the middle
        startTime = System.nanoTime();
        linkedList.add(500000, -1);
        endTime = System.nanoTime();
        System.out.println("Time taken to Add in Middle: " + (endTime - startTime) + " nanoseconds");

        // Add an element at the end
        startTime = System.nanoTime();
        linkedList.addLast(-1);
        endTime = System.nanoTime();
        System.out.println("Time taken to Add at Tail: " + (endTime - startTime) + " nanoseconds");

        // Remove the first element
        startTime = System.nanoTime();
        linkedList.removeFirst();
        endTime = System.nanoTime();
        System.out.println("Time taken to Remove from Head: " + (endTime - startTime) + " nanoseconds");

        // Remove an element from the middle
        startTime = System.nanoTime();
        linkedList.remove(500000);
        endTime = System.nanoTime();
        System.out.println("Time taken to Remove from Middle: " + (endTime - startTime) + "nanoseconds");

        // Remove the last element
        startTime = System.nanoTime();
        linkedList.removeLast();
        endTime = System.nanoTime();
        System.out.println("Time taken to Remove from Tail: " + (endTime - startTime) + " nanoseconds");
    }
}
