public class overloading {
    public static void main(String[] args) {
        
    calculator first=new calculator();
   int ans= first.sum(1, 2);
    float ans1=first.sum((float)1.2,(float)1.2);
    System.out.println(ans+","+ans1);



}}
class calculator{
    float sum(float a,float b){
        return a+b;
        
    }
    
    int sum(int a,int b){
        return a+b;
    }
}

