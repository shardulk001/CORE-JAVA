public class abstractclass {
    
    public static void main(String[] args) {
        
       chiken d = new chiken();
         
      

    }  


}

class animal{
    String color;
    animal(){
        System.out.println("animal called first");

    }
        
}


class mustang extends animal{
      mustang(){
        System.out.println("mustang called 2nd");
      }
}

class chiken extends mustang{
    chiken(){
        System.out.println("chiken called last");
    }
}
