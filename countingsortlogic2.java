
import java.util.*;
public class countingsortlogic2 {

    public static void countingsort(int arr[]){
        int largest=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++){
        largest=Math.max(largest,arr[i]);
     }

     int count[]=new int [largest+1];
     for(int i=0;i<arr.length;i++){
        count[arr[i]]++;
     }
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
        int arr[]={5,4,2,1,3,4,2,5};
        countingsort(arr);
        printarr(arr);
    }
}
