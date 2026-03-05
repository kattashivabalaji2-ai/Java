package Threads.LambdaExpression.WithLambda;
//lambda Expressions can be used only if the interface has singke fucntion within it.
interface Greeting{
    void sayHello();
}
public class Demo {
    public static void main(String[] args) {
        Greeting g=()->{
            System.out.println("Hello World");
        };
        g.sayHello();
    }
}
