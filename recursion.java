public class recursion {

//................................................................................................

 /*factorial using stalk memory in recursioin*/



//     int n;

//    public static void funtion(int n){

   
//         if(n==1){
//             System.out.print(n);
//             return;
//           }
//           System.out.print(n+" ");
//           funtion(n-1);
  
      

//     }

       

    public static void main(String[] args) {
      //int n=3;
      //incresing(n);
      //System.out.println(factorial(n));
      //System.out.println(fibnacci(25));

      int arr[]={1,2,3,6,5,6,7,8,1};
      System.out.println(lastocc(arr, arr.length-1));

    //  System.out.println(sortbyrecursion(arr, 0));

    }

//...................................................................................................

//....................................................................................................


public static void incresing(int n){

    if(n==1){
        System.out.print(n);
        return;

    }

    incresing(n-1);
    System.out.print(n + " ");

}

//........................................................................................................

public static int  factorial(int n){
    if (n==0){
        return 1;
    }

   int fact=(n-1);
   int fun=n;
   int ans=fun+fact;
   return ans;
       
}


public static int fibnacci(int n){

    if( n==1 || n==0 ){
        System.out.println(n);
        return n;

    }
     //int f1=
    int ans= (fibnacci(n-1))+(fibnacci(n-2));

   // System.out.println(ans);

    return ans;

}

public static boolean sortbyrecursion(int arr[],int i){

    if(i==arr.length-1){
        return true;
    }
    if(arr[i]>i+1){
        return false;
    }
    return sortbyrecursion(arr, i+1);

}

public static int firstocc(int arr[],int i){
    int key = 6;
    if (i < 0) {
        return -1; 
    }
    if(arr[i]==key ){
        return i;
    }
    return firstocc(arr, i-1);
   
    
}

public static int lastocc(int arr[], int i) {
    int key = 1;
    if (i < 0) {
        return -1; 
    }
    if (arr[i] == key) {
        return i;  
    }
    return lastocc(arr, i - 1); 
}

}
