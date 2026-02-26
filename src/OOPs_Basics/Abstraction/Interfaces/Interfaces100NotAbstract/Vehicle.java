package OOPs_Basics.Abstraction.Interfaces.Interfaces100NotAbstract;

public interface Vehicle {
    void start();
    default void stop(){
        System.out.println("Stopping");
    }
}
class Audi implements Vehicle{
    public void start()
    {
        System.out.println("Audi has started");
    }
}
class BMW implements Vehicle{
    public void start()
    {
        System.out.println("BMW has started");
    }
}
class RolceRoyce implements Vehicle{
    public void start()
    {
        System.out.println(" RolceRoyce has started");
    }
}
class Driver1{
    public static void main(String[] args) {
        Audi a=new Audi();
        a.start();
        a.stop();
    }
}