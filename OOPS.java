public class OOPS {

    public static void main(String[] args) {
        
        
        student s1=new student();
        student s2=new student("shrdul");
        student s3=new student(123);

    }
}

    
    class student{

        String name;
        int roll;

        
        student(){
            System.out.println("constructor is calling.....");
        }

        student(String name){
            this.name=name;
        }

        student(int roll){
            this.roll=roll;
        }
    }








