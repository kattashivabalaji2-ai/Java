package OOPs_Basics.Abstraction.Interfaces.Upcastingeg;
//Upcasting Example Program
public interface Vehicle {
    void start();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Car Started!!");
    }
}
class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike Started!!");
    }
}
class driver{
    public static void main(String[] args) {
        Vehicle v=new Car();
        v.start();
        Vehicle v1=new Bike();
        v1.start();
    }
}

