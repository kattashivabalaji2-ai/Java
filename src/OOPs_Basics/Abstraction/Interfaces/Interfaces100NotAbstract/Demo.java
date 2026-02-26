package OOPs_Basics.Abstraction.Interfaces.Interfaces100NotAbstract;
//Why interfaces are not 100% abstract
public interface Demo{
    void show();
    default void display(){
        System.out.println("Default method");
    }
    static void message(){
        System.out.println("Message");
    }
}
class Driver{
    public static void main(String[] args) {
        Demo.message();
    }
}

