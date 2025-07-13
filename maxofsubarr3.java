public class maxofsubarr3 {
    
    public static void arr(int n[]){

        int ms=Integer.MIN_VALUE;
        int sm=0;

        for(int i=0;i<n.length;i++){
          sm += n[i];
          if(sm<0){
            sm=0;
          }
          ms=Math.max(sm,ms);
        }
        System.out.println("max sum is"+ms);
    }
    public static void main(String[] args) {
        int n[]={-2,-3,4,-1,-2,1,5,-3};
        arr(n);
    }
}
