import java.util.*;

public class function 
{
   
   public static int fact(int n)
   {

      int f=1;
      for(int i=1;i<=n;i++){
        f=f*i;
      }
      return f;
   }
   

    public static void main(String[] args)
    {
      //Scanner sc= new Scanner(System.in);
      
      //System.out.println("enter a and b:");

      //int a=sc.nextInt();
      //int b=sc.nextInt();

      int n=19;
      int ans=fact(n);

        System.out.println(ans);
    }

}

   
