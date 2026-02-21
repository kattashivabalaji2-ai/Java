package OOPs_Basics.Polymorphism.Runtime;
//overriding
public class Mom {
    void cook(){
        System.out.println("Cooking Indian");
    }
}
class Daughter extends Mom{
    void cook(){
        System.out.println("Cooking Chinese");
    }
}
class Driver2{
    public static void main(String[] args) {
        Mom m=new Mom();
        Daughter d=new Daughter();
        m.cook();
        d.cook();
    }
}
