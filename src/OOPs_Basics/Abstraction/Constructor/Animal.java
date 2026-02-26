package OOPs_Basics.Abstraction.Constructor;

abstract class Animal {
    Animal(){
        System.out.println("Animal Constructor");
    }
    abstract void sound();
}
class dog extends Animal{
    dog()
    {
        System.out.println("Dog Constructor ");
    }
    void sound(){
        System.out.println("Dog barks");
    }
}
class Driver{
    public static void main(String[] args) {
        dog d=new dog();
        d.sound();
    }
}
/*Why does abstract class has constructor?
->Constrctors are used for intializing common data
->When a child class object is created,the parent class constructor runs first.
->Here the parent constructor is being executed because of inheritance
 */