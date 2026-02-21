//Example to show that constructor is being called during object creation
package OOPs_Basics.Constructors;

public class Demo {
    Demo(){//manually making constructor show that its called..
        System.out.println("Im a Constructor");
    }
}
class drive{
    public static void main(String[] args) {
        Demo obj=new Demo();
    }
}