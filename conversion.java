
import java.util.*;
public class conversion {


//----------------------------------------------------------
//for biary to decimal conversion

    
    /*public static void bintodec(int binno)
    {
        int myno=binno;
        int pow=0;
        int decnum=0;

        while(binno>0)
        {
        
    int lastdig=binno%10;
            decnum=decnum+(lastdig * (int)Math.pow(2,pow));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
            pow++;
            binno=binno/10;
        }
        System.out.println("decimal of "+myno+"="+decnum);
        
    }


    public static void main (String[] args)
    {
        bintodec(101);
 
 
    }*/

//----------------------------------------------------------------
// for decimal to bianry conersion

    public static void dectobin(int no)
    {

        int myno=no;
        int pow=0;
        int binary=0;
        

        while(no>0)
        {  
            
            int rem=no%2;
            binary=binary+(rem*(int)Math.pow(10,pow));
            pow++;
            no /= 2;

        }

        System.out.println("deciml="+myno+"binary="+digit);

    }

    public static void main(String[] arg)
    {
        dectobin(11);
    }
}