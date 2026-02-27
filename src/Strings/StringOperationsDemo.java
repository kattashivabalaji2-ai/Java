package Strings;

public class StringOperationsDemo {
    public static void main(String[] args) {
        String s1=new String("Java Programming");
        String s2="Java Programming";

        //length
        System.out.println("Length of String1:"+s1.length());

        //charAt
        System.out.println("Character at index 5 is "+s1.charAt(5));

        //toUpper
        System.out.println("UPPER CASE:"+s1.toUpperCase());
        System.out.println("lower case:"+s1.toLowerCase());

        //== and equals
        System.out.println("=="+s1==s2);
        System.out.println("equals():"+s1.equals(s2));

        //compareTo
        System.out.println("Comparing two strings:"+s1.compareTo(s2));

        //subString
        System.out.println("substring:"+s1.substring(0,4));

        //contain
        System.out.println("Contains:"+s1.contains("Java"));

        //indexOf
        System.out.println("Index of J is:"+s1.indexOf("J"));

        //replace()
        System.out.println("Replace java with python"+s1.replace("Java","Python"));

        //startwith() and endwith()
        System.out.println("Starts with Java:"+s1.startsWith("Java"));
        System.out.println("Starts with Java:"+s1.endsWith("Java"));

        //trim()
        System.out.println("Trim:"+s1.trim());

        //concat()
        System.out.println("Concat:"+s1.concat("Concepts"));

        //isEmpty()
        System.out.println("Is Empty?:"+s1.isEmpty());
        String s3="";
        System.out.println("Is s3 Empty?:"+s3.isEmpty());





    }
}
