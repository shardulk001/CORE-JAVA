public class arraycc {
    public static int numbers(String menu[],String key1)
    {
        for(int i=0; i<menu.length;i++)
        {
            if(menu[i].equals(key1)){
                return i;
            }
        }
        
            return -1;
        
    }


    public static void main(String[] args) {
        //int a[]={2,4,6,8,10,12,14,16};
        String menu []={"samosa","chutney","chole"};
        //int key=10;
        String key1="samosa";

        //int index=numbers(a,key);
        int index=numbers(menu,key1);
        if(index==(-1)){
            System.out.println("NOt Found");
        }
        else{
            System.out.println("found in index"+index);
        }
    }
}
