public class Demo{
    public static void main(String[] args) {
        System.out.println("Main method");
    }
    static int m1 = fun1();
    static{
        System.out.println("Hello");
    }
    static int fun1(){
        System.out.println("fun1 called");
        return 1;
    }
}