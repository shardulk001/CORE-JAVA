public class throwing1 
{
    public static void main (String arg[]) throws Exception
    {
        try
        {
          System.out.println("before throw");
          throw new Exception();
          System.out.println("after throw");
        }
        catch(Exception me)
        {
            System.out.println(me.getMessage());
        }
        
       /*  catch (Exception e)
        {
            System.out.println(e.getMessage());
        } */   
        System.out.println("After try/cath block");    
    
    }
    
}
