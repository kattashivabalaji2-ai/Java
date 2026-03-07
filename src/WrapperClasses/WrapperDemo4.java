package WrapperClasses;
//one of the best reasons,why we use wrapper classes
public class WrapperDemo4 {
    public static void main(String[] args) {
        String str="123";
        int num=Integer.parseInt(str);//String-->int

        System.out.println(num);
        System.out.println(num+3);
    }
}
