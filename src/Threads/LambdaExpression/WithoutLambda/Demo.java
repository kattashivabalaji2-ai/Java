package Threads.LambdaExpression.WithoutLambda;
interface Greeting{
    void sayHello();
}
public class Demo {
    public static void main(String[] args) {
        Greeting g = new Greeting() {//anonymous class
            public void sayHello() {
                System.out.println("Hello World");
            }
        };
        g.sayHello();
    }
}