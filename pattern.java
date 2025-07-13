import java.io.*;
public class pattern 
{

    public static void main(String arg[])throws IOException
    {
        int a,b;
        String st;
        InputStreamReader read =new InputStreamReader(System.in);
        BufferedReader in =new BufferedReader(read);
        System.out.println("enter your word to print a pattern ");
        st=in.readLine();
        b=st.length();
        for(a=0;a<b;a++)
        {
            System.out.println(st.charAt(a));
        }
    }
}
