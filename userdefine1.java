                          //add sub//

/*import java.io.*;
 class userdefine1
{
    
    int m,n,s,d;
    public void inputdata()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("enter your 1st number:");
        m=Integer.parseInt(in.readLine());
        System.out.println("enter your 2nd number :");
        n=Integer.parseInt(in.readLine());

    }
    
    public void output()
    {

         s=m+n;
         System.out.println("add of two number is :"+s);
         d=m-n;
        System.out.println("sub of two number is :"+d);
    }
}
public class userdefine
{
    public static void main (String arg[])throws Exception
    
    {
         userdefine1  obj=new userdefine1();
         //userdefine1  obj1=new userdefine1();
         //obj1.calculation();
         //obj1.output();
         obj.inputdata();
         //obj1.inputdata();
         obj.output();
    }
}*/

                         // reference member methods//


class sum1{
    int a,b,c;
   sum1 (int x,int y)
    {
        a=x;
        b=y;
    }
  public  int calculation()
    {
        c=a+b;
        return c;
    }
    /*void display()
    {
        return c;
         //System.out.println("add of two number is :"+c);
    }*/
}
class userdefine12
{
    public static void main (String arg[])
    {
        
        sum1 ob=new sum1(4,2);
        sum1 ob1=new sum1 (3,7);
        //ob.getdata(5,8);
        System.out.println(ob.calculation());
        //ob.display();
        //ob1.getdata(2,4);
        System.out.println(ob1.calculation());
        //ob1.display();

    }
}


