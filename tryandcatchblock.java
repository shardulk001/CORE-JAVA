

public class tryandcatchblock 
{
  public static void main(String arg[])
  {
    int num=12;
    int denom=0;int ans=0;
    //System.out.println("in try block");
    try{
        System.out.println("in try block");
        ans=num/denom;
        System.out.println("this will not be printed");
    }
    catch (ArithmeticException ae)
    {
        System.out.print("divide by zero error");
    }
    System.out.print("after catch block");

  }    
}
