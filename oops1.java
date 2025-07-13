public class oops1 {
    public static void main(String args[]){

      

        mamal sheru=new  mamal();
        sheru.type();

        fish goldfish=new  fish();
        goldfish.type();

        bird kakbhushandi=new  bird();
        kakbhushandi.type();

    }
    

}

class animal{

    String color;

    void eat(){
        System.out.println("eates");
    }

    void breath(){
        System.out.println("breath");
    }

    void breed(String n){
        System.out.println(n);
    } 
    void haircolor(String m){
        System.out.println(m);
    }
    
}



class mamal extends animal{

    void type(){
        System.out.println("can walk");
    }
    
}



class fish extends animal{
    void type(){
        System.out.println("can swim");
    }
}

class bird extends animal{
    void type(){
        System.out.println("can fly");

    }
}