import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        // Generate an array with 50 random integers
        int[] randomNumbers = generateRandomArray(50);

        // Display the array before sorting
        System.out.println("Array before sorting:");
        printArray(randomNumbers);

        // Sort the array
        Arrays.sort(randomNumbers);

        // Display the array after sorting
        System.out.println("\nArray after sorting:");
        printArray(randomNumbers);
    }

    // Method to generate an array with random integers
    public static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100); // Generates integers between 0 and 99
        }
        return array;
    }

    // Method to print an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}