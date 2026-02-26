package OOPs_Basics.Abstraction.StaticDemo;
abstract class Animal{
    static void info(){
        System.out.println("Animals are living beings");
    }
    abstract void sound();
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Driver{
    public static void main(String[] args) {
        Dog d=new Dog();
        Animal.info();
        d.info();
        d.sound();
    }
}
