import java.util.ArrayList;

public class ArrayListComplexity {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Populate the ArrayList
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        // Access element by index
        long startTime = System.nanoTime();
        int retrievedValue = arrayList.get(500000);  // Retrieve the value
        long endTime = System.nanoTime();
        System.out.println("Element at index 500000: " + retrievedValue);
        System.out.println("Time for Index Access: " + (endTime - startTime) + " nanoseconds");

        // Check for specific value
        startTime = System.nanoTime();
        boolean exists = arrayList.contains(999999);
        endTime = System.nanoTime();
        System.out.println("Value 999999 exists: " + exists);
        System.out.println("Time for Value Check: " + (endTime - startTime) + " nanoseconds");

        // Add new element at the start
        startTime = System.nanoTime();
        arrayList.add(0, -1);
        endTime = System.nanoTime();
        System.out.println("Time for Insertion at Start: " + (endTime - startTime) + " nanoseconds");

        // Insert element in the middle
        startTime = System.nanoTime();
        arrayList.add(500000, -1);
        endTime = System.nanoTime();
        System.out.println("Time for Insertion in Middle: " + (endTime - startTime) + " nanoseconds");

        // Append element at the end
        startTime = System.nanoTime();
        arrayList.add(-1);
        endTime = System.nanoTime();
        System.out.println("Time for Appending at End: " + (endTime - startTime) + " nanoseconds");

        // Remove element from the start
        startTime = System.nanoTime();
        arrayList.remove(0);
        endTime = System.nanoTime();
        System.out.println("Time for Deletion from Start: " + (endTime - startTime) + " nanoseconds");

        // Remove element from the middle
        startTime = System.nanoTime();
        arrayList.remove(500000);
        endTime = System.nanoTime();
        System.out.println("Time for Deletion from Middle: " + (endTime - startTime) + " nanoseconds");

        // Remove element from the end
        startTime = System.nanoTime();
        arrayList.remove(arrayList.size() - 1);
        endTime = System.nanoTime();
        System.out.println("Time for Deletion from End: " + (endTime - startTime) + " nanoseconds");
    }
}
