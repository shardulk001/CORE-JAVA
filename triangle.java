public class triangle {
    
    public static void tri(int n)
    { int counter =1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
              System.out.print(counter);
            }
                
                counter++;
                

            System.out.println();
        }
    }

    public static void main(String[] args) {
         
        tri(5);
    }
}
