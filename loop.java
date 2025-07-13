
import java.util.*;
public class loop 
{
    public static void main(String[] args)
    {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the number ");
        int n = sc.nextInt();
        
       //int n=10234;

       int lastdigi;
       int rev=0;

       while(n>0)
       {
        lastdigi=n%10;
        rev=rev*10+n;
        System.out.print(lastdigi);
        n=n/10;
        
       }
        
    }
}
