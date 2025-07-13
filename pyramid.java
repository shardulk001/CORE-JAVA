public class pyramid {
    
    public static void triangle(int a)
    {
        int counter=1;
        for(int i=1;i<=a;i++)
        {  counter++;
            for(int j=1;j<=a-i;j++)
            { 
              System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {  
                System.out.print("counter");
            }
            System.out.println();
        }
       
    }
   

    public static void main(String[] args) {
         
        triangle(4);
    }
}
