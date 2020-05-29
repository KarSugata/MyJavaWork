class Hello{
    public Hello(){
        this(10, 20);
        System.out.println("Default Constructor");
    }
    public Hello(int a, int b){
        System.out.println("Parametrized Constructor");
        System.out.println("a= "+a+" b= "+b);
    }
}
public class Test{
    public static void main(String[] args) {
        Hello obj = new Hello(10,20);
        System.out.println();
    }
}