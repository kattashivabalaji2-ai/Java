//Example for single level Inheritance
package OOPs_Basics.Inheritance;

public class Animal {
    void eat(){
        System.out.println("Eating");
    }
}
class Lion1 extends Animal{
    void roar(){
        System.out.println("Roaring...");
    }
}
class Drivee{
    public static void main(String[] args) {
        Animal a=new Animal();
        a.eat();
        Lion1 l=new Lion1();
        l.eat();
        l.roar();
    }
}
