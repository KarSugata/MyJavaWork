class good{
    public int a;
    public good(){
        System.out.println("Constructor Invoked");
    }
    {
        System.out.println("Hello Wolrd");
    }
    public void fun1(){
        System.out.println("fun1 called, a="+a);
    }
}
public class Demo1{
    public static void main(String[] args){
        //Demo1 obj1 = new Demo1();
        good obj = new good();
        obj.fun1();
    }
}