import java.util.Scanner;

public class TwoDArray {
    
    public static boolean search(int matrix[][], int key) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("Key found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    
    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
    
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter elements of the 3x3 matrix:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    
        System.out.println("Matrix:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    
        System.out.println("Searching for key 5:");
        search(matrix, 5);
    }
}

