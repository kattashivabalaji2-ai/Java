package Strings.BufferandBuilder;

public class StringbufferEx {
    public void StringAppend() {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Old string:" + sb);
        sb.append(" World");
        System.out.println("New String:" + sb);
    }

    public void StringInsert() {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Old string:" + sb);
        sb.insert(1, "eee");
        System.out.println("New String:" + sb);
    }

    public void reverse() {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Old string:" + sb);
        sb.reverse();
        System.out.println("New String:" + sb);
    }
    public static void main(String[] args) {
        StringbufferEx sb=new StringbufferEx();
        sb.StringAppend();
        sb.StringInsert();
        sb.reverse();

    }

}


