package Threads.LambdaExpression.WithoutLambda.Ex2;
interface Calculator{
    int add(int a,int b);
}
public class Demo {
    public static void main(String[] args) {
        Calculator c=new Calculator(){
            public int add(int a,int b) {
                return a + b;
            }
        };
        int result=c.add(10,20);
        System.out.println("Result:"+result);
    }
}
