import  java.util.*;

public class allsorting {


    //--------------------------for descending sorting------------------------------------------------------------------------
    

    // public static void bubbleSortDescending(int[] arr) {
    //     int n = arr.length;
    //     for (int i = 0; i < n - 1; i++) {
    //         for (int j = 0; j < n - i - 1; j++) {
    //             if (arr[j] < arr[j + 1]) {
    //                 // Swap arr[j] and arr[j+1]
    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //             }
    //         }
    //     }
    // }

    
    // public static void selectionSortDescending(int[] arr) {
    //     int n = arr.length;
    //     for (int i = 0; i < n - 1; i++) {
    //         int maxIndex = i;
    //         for (int j = i + 1; j < n; j++) {
    //             if (arr[j] > arr[maxIndex]) {
    //                 maxIndex = j;
    //             }
    //         }
    //         // Swap arr[i] and arr[maxIndex]
    //         int temp = arr[i];
    //         arr[i] = arr[maxIndex];
    //         arr[maxIndex] = temp;
    //     }
    // }

    
    // public static void insertionSortDescending(int[] arr) {
    //     int n = arr.length;
    //     for (int i = 1; i < n; ++i) {
    //         int key = arr[i];
    //         int j = i - 1;
    //         while (j >= 0 && arr[j] < key) {
    //             arr[j + 1] = arr[j];
    //             j = j - 1;
    //         }
    //         arr[j + 1] = key;
    //     }
    // }

    
    // public static void countingSortDescending(int[] arr) {
    //     // Find the largest element in the array
    //     int largest = Integer.MIN_VALUE;
    //     for (int i = 0; i < arr.length; i++) {
    //         largest = Math.max(largest, arr[i]);
    //     }
       
    //     int[] count = new int[largest + 1];
    //     for (int num : arr) {
    //         count[num]++;
    //     }
    
    //     // Reconstruct the sorted array
    //     int index = arr.length - 1;
    //     for (int i = largest; i >= 0; i--) {
    //         while (count[i] > 0) {
    //             arr[index--] = i;
    //             count[i]--;
    //         }
    //     }
    // }


    //------------------------for ascending sorting------------------------------------------------------------------------//


    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1])
                 {
                   //swaping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    
    public static void selectionSortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
          //swaping
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    
    public static void insertionSortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    
    public static void countingSortAscending(int[] arr) {
        // Finding max element 
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
    
        // Create a counting array to store the count of each element
        int[] count = new int[largest + 1];
        for (int num : arr) {
            count[num]++;
        }
    
        // Reconstruct the sorted array
        int index = 0;
        for (int i = 0; i <= largest; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }

        
    }
    


    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

//------------------------for descending sorting---------------------------------------------------------------------------------------

    //  bubbleSortDescending(arr);
    //  selectionSortDescending(arr);
    //  insertionSortDescending(arr);
    //  countingSortDescending(arr);

//------------------------for ascending sorting----------------------------------------------------------------------------

    bubbleSortAscending(arr);
// or selectionSortAscending(arr);
// or insertionSortAscending(arr);
// or countingSortAscending(arr);

    printarr(arr);

    }
}
