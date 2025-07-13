public class largearray {
    public static int bigger(int num[]){
       
        int large=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){

            if(large<num[i])
            {
                large=num[i];
            }
    
        }
        return large;
    }
   
public static void main(String[] args) {
    int num[]={1,2,3,4,5,6};
   System.out.println(bigger(num));
}

}
