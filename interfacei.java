public class interfacei {
    

    public static void main(String[] args) {
        
        queen move = new queen();
        move.moves();
    }
}

interface chessplay{

 abstract void moves();

}

class queen implements chessplay{
    public void moves(){
        System.out.println("all the desire directions");
        
    }
}

class king implements chessplay{
    public void moves(){
        System.out.println("only one direction");
    }
}
