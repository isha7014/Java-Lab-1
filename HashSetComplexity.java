import java.util.HashSet;

public class HashSetComplexity {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        // Populate the HashSet
        for (int i = 0; i < 1000000; i++) {
            hashSet.add(i);
        }

        // Search for a specific value
        long startTime = System.nanoTime();
        boolean found = hashSet.contains(500000);
        long endTime = System.nanoTime();
        System.out.println("Search for value 500000: " + found);
        System.out.println("Time for Value Search: " + (endTime - startTime) + " nanoseconds");

        // Note about index-based access
        System.out.println("Index-based access is not available in HashSet.");

        // Insert a new element
        startTime = System.nanoTime();
        hashSet.add(-1);
        endTime = System.nanoTime();
        System.out.println("Time for Inserting Element: " + (endTime - startTime) + " nanoseconds");

        // Remove an element
        startTime = System.nanoTime();
        hashSet.remove(999999);
        endTime = System.nanoTime();
        System.out.println("Time for Deleting Element: " + (endTime - startTime) + " nanoseconds");
    }
}
