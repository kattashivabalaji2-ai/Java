package OOPs_Basics.Abstraction.Interfaces.Waystoaccessdefaultmethods;

public interface Vehicle {
      default void stop(){
          System.out.println("Stopped!!!");
      }
}
class Car implements Vehicle{
    void carFunction(){
        System.out.println("Car function");
    }
}
class Bike implements Vehicle{
    void bikeFunction(){
        System.out.println(" Bikefunction");
    }
}
class Driver{
    public static void main(String[] args) {
        Car c=new Car();
        c.stop();//1st way to access default

         Vehicle v=new Car();//upcasting
         v.stop();//2nd way to access default

        Bike b= new Bike();
        b.stop();//3rd way to access default
    }
}
