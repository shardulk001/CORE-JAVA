public class toupper {

    public static String toUpperCase(String str){
        StringBuilder sb= new StringBuilder(""); //stringbuilder is the funtion just like scanner in this we scan strings and do further oprations
        char ch =Character.toUpperCase(str.charAt(0));
        sb.append(ch);//append is th funtion that cocatinate strings 

        for(int i=1;i<str.length();i++){//i=1 bocoz w already uppered the 0th index of the string
            if(str.charAt(i)==' ' && i<str.length()-1){//if the ith character is null of space 
                sb.append(str.charAt(i));//print the space as it is
                i++;//increase the character by 1 and..
                sb.append(Character.toUpperCase(str.charAt(i)));//upper the case of the character that is just next of the space 

            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();// toString() is the funtion that convert all the objects(character,integer,floating) in string form;
    }
    public static void main(String[] args) {
        String str= "hi im shardul";
        System.out.println(toUpperCase(str));
        
    }
}
