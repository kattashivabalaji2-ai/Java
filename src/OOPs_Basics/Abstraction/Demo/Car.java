package OOPs_Basics.Abstraction.Demo;

abstract class Car {
    abstract void Model();

    abstract void year();

    void display() {
        System.out.println("Congratulations for your purchase");
    }
}
class Bmw extends Car{
    void Model(){
        System.out.println("BMW1");
    }
    void year(){
        System.out.println("2000");
    }
}
class Cardemo{
    public static void main(String[] args) {
        Bmw b1=new Bmw();
        b1.Model();
        b1.year();
        b1.display();
    }
}
