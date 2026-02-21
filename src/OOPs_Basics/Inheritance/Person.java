package OOPs_Basics.Inheritance;
//usage of super keyword
public class Person {
    String fname;
    String lname;
    Person(String fname, String lname){
        this.fname=fname;
        this.lname=lname;
    }
}
class Student extends Person{
    int usn;
    Student(String fname, String lname,int usn){
        super(fname,lname);//calling parent constructor here using super keyword.
        this.usn=usn;
    }
    void display(){
        System.out.println("Name:"+fname+" "+lname+"\n Usn:"+usn);
    }
}
class Driver1{
    public static void main(String[] args) {
        Student s1=new Student("shiva","S",123);
        s1.display();
    }
}


