//Example for default constructor and its being called.
package OOPs_Basics;
class Demo{
    void print(){
        System.out.println("Demo..........");
    }
}
class driver {
    public static void main(String[] args) {
        Demo obj = new Demo();//object creation
        obj.print();//method call from main class
    }
}
