package OOPs_Basics.Abstraction.Demo;

import com.sun.jdi.PathSearchingVirtualMachine;

abstract class Animal {
    abstract void sound();
    void run(){
        System.out.println("Running....");
    }
}
class Lion extends Animal{
    void sound(){
        System.out.println("Roar");
    }
}
class cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}
class DRIVER{
    public static void main(String[] args) {
        Lion l=new Lion();
        l.sound();
        l.run();
        cat c=new cat();
        c.sound();
        c.run();
    }
}