package OOPs_Basics.Abstraction.Interfaces.DEMO;

public interface Animal {
    void sound();
    void run();
}
class Lion implements Animal{
    public void sound(){
        System.out.println("Roar");
    }
    public void run(){
        System.out.println("RUnning..");
    }
}
class Drive{
    public static void main(String[] args) {
        Lion l=new Lion();
        l.sound();
        l.run();
    }
}

