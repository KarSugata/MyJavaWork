class SuperCar{
    protected int maxSpeed = 100;
}
class SubCar extends SuperCar{
   protected  int maxSpeed = 180;
    public void showSpeed(){
        System.out.println("MaxSpeed: "+maxSpeed);
    }
}
class Car{
    public static void main(String[] args) {
        SubCar obj = new SubCar();
        obj.showSpeed();
        //SuperCar obj1 = new SuperCar();
    }
}
