public class functions 
{
    /*int show (int a)
    {
        a=2*a+5;
        return(a);
    }
    public static void main (String arg[])
    {
       functions ob=new functions();
       int p=5,k;
       k=ob.show(p);
       System.out.println("the acual arguments before performance task:"+p);
       System.out.println("the value of variables after performing task:"+k);
    }*/

void add (int x[])
{
    int i,p;
    p=x.length;
    for(i=0;i<p;i++)
    x[i]=x[i]+2;
    System.out.println("the change during function call:");
    for(i=0;i<p;i++)
    {
        System.out.println("the change during function call");
        for(i=0;i<p;i++)
        {
           System.out.println(x[i]+"");
           System.out.println();
        }
    }
    public static void main(String []args)
    {
        int a[]={3,6,8,9};
        int j,q;
        q=a.length;
        functions obj=new functions();
        obj.add(a);
        System.out.println("the arguements after function call:");
        for(j=0;j<q;j++)
        {
            System.out.println(a[j]+" ");
            System.out.println();
        }
    }

}
}


