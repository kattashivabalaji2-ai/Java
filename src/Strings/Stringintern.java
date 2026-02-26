package Strings;

public class Stringintern {
    public static void main(String[] args) {
        String s1=new String("Hello");
        String s2="Hello";
        System.out.println(s1==s2);//false
        String s3=s1.intern();//checks the string pool
        System.out.println(s1==s3);//false
        System.out.println(s2==s3);//true
    }
}
