import java.util.*;

public class sumofseries
{
    public static void main (String arg[])
    
    {
      Scanner in = new Scanner (System.in) ; 
      System.out.print("enter the value of a and n");
      int a,i,n;
      double s=0;
      a=in.nextInt();
      n=in.nextInt();
      for(i=1;i<=n;i++)
      s=s+(double)a/(i+1);
      System.out.println("sum of the series ="+s);
    }
    }
   
