package Strings.BufferandBuilder;


public class StringBuilderEx {
    public void StringAppend() {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Old string:" + sb);
        sb.append(" World");
        System.out.println("New String:" + sb);
    }

    public void StringInsert() {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Old string:" + sb);
        sb.insert(1, "eee");
        System.out.println("New String:" + sb);
    }

    public void reverse() {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Old string:" + sb);
        sb.reverse();
        System.out.println("New String:" + sb);
    }
    public static void main(String[] args) {
        StringBuilderEx sb=new StringBuilderEx();
        sb.StringAppend();
        sb.StringInsert();
        sb.reverse();

    }

}


