class SuperClass{
    int a = 111;
    int b = 222;
    public SuperClass(){
        System.out.println("Parent Class Constructor");
    }
    public void fun1(){
        System.out.println("Super Class fun1()");
    }
}
class SubClass extends SuperClass{
    int a = 333;
    int b = 444;
    public SubClass(){
        super();
        System.out.println("Child Class Constructor");
    }
    public void fun1(){
        int a = 555;
        System.out.println("Sub Class fun1()");
        System.out.println("Local a: "+a);
        System.out.println("Class Level a:"+this.a);
        System.out.println("Super Class a: "+super.a);
    }
}
public class Super{
    public static void main(String[] args) {
        SubClass sc = new SubClass();
        sc.fun1();    
    }
}