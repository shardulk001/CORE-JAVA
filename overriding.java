public class overriding {
    
    public static void main(String[] args) {
        
        // animal abc =new animal();
        // abc.eat();

        deer cda = new deer();
        cda.eat();


    }

}

class animal{
    void eat(){
        System.out.println("eats everything");
    }
}

class deer extends animal{
    void eat(){
        System.out.println("eat only grass");
    }
}
