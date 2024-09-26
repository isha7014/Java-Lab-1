public class ArrayComplexity {
    public static void main(String[] args) {
        int size = 1000000;  // Number of elements
        int[] array = new int[size];

        // Fill the array with values
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        // Measure time to read by index
        long startTime = System.nanoTime();
        int value = array[500000];  // Get value at index 500000
        long endTime = System.nanoTime();
        System.out.println("Value retrieved at index 500000: " + value);  // Print the value
        System.out.println("Array Read by Index Time: " + (endTime - startTime) + " nanoseconds");

        // Measure time to read by value
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            if (array[i] == 999999) break;  // Find 999999
        }
        endTime = System.nanoTime();
        System.out.println("Array Read by Value Time: " + (endTime - startTime) + " nanoseconds");

        // Measure time to insert at the head
        startTime = System.nanoTime();
        System.arraycopy(array, 0, array, 1, size - 1);  // Shift elements
        array[0] = -1;  // Insert -1 at the start
        endTime = System.nanoTime();
        System.out.println("Array Insert at Head Time: " + (endTime - startTime) + " nanoseconds");

        // Measure time to insert in the middle
        startTime = System.nanoTime();
        System.arraycopy(array, 500000, array, 500001, size - 500001);  // Shift elements
        array[500000] = -1;  // Insert -1 at index 500000
        endTime = System.nanoTime();
        System.out.println("Array Insert in Mid Time: " + (endTime - startTime) + " nanoseconds");

        // Measure time to insert at the tail
        startTime = System.nanoTime();
        array[size - 1] = -1;  // Insert -1 at the end
        endTime = System.nanoTime();
        System.out.println("Array Insert at Tail Time: " + (endTime - startTime) + " nanoseconds");

        // Measure time to delete from the head
        startTime = System.nanoTime();
        System.arraycopy(array, 1, array, 0, size - 1);  // Shift elements
        endTime = System.nanoTime();
        System.out.println("Array Delete from Head Time: " + (endTime - startTime) + " nanoseconds");

        // Measure time to delete from the middle
        startTime = System.nanoTime();
        System.arraycopy(array, 500001, array, 500000, size - 500001);  // Shift elements
        endTime = System.nanoTime();
        System.out.println("Array Delete from Mid Time: " + (endTime - startTime) + " nanoseconds");

        // Measure time to delete from the tail
        startTime = System.nanoTime();
        array[size - 1] = 0;  // Remove the last element
        endTime = System.nanoTime();
        System.out.println("Array Delete from Tail Time: " + (endTime - startTime) + " nanoseconds");
    }
}
