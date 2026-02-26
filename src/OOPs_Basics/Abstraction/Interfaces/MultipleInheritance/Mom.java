package OOPs_Basics.Abstraction.Interfaces.MultipleInheritance;
interface Mom {
    default void cook(){
        System.out.println("Indian");
    }
}
interface Dad {
    default void cook(){
        System.out.println("Chinese");
    }
}
class daughter implements Mom,Dad{
    public void cook(){
        Dad.super.cook();
        //System.out.println("Indian");
    }
}
class Main{
    public static void main(String[] args) {
        daughter d=new daughter();
        d.cook();
    }
}