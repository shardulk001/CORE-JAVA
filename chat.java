import java.util.*;

public class chat {

    public static void countingSort(int[] arr) {
        if (arr.length == 0)
            return;

        // Find the maximum element in the array
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Create a counting array to store the count of each element
        int[] count = new int[max + 1];

        // Count the occurrences of each element
        for (int num : arr) {
            count[num]++;
        }

        // Reconstruct the sorted array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 1, 3};

        // Perform counting sort
        countingSort(arr);

        // Print the sorted array
        printArray(arr);
    }
}

