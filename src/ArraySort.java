import java.util.Arrays;
import java.util.Random;

public class ArraySort {
	
	  public static int[] generateRandomArray(int length) {
	        int[] array = new int[length];
	        Random random = new Random();
	        for (int i = 0; i < length; i++) {
	            array[i] = random.nextInt(100); // Generates integers between 0 and 99
	        }
	        return array;
	    }
    }
