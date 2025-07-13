public class stringfunction {


// INSTEAD OF THIS CODE
// WE CAN SMPLY WIRITE THE FUNTION
// str.substring(si.ei);

    // public static String substrings( String str ,int si,int ei){
    //     String substr="";
    //     for(int i=si;i<ei;i++){
    //         substr += str.charAt(i);
    //     }
    //     return substr;

   // }
    public static void main(String arg[]){
        String str="hello world";
       // System.out.println(substrings(str,0,5));
       System.out.println(str.substring(0,5));
    }
}
