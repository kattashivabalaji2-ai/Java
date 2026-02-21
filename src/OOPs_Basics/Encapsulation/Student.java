package OOPs_Basics.Encapsulation;



class Student{
    private String name;//encapsulation concept(private)
    private int usn;

Student(String name, int usn){
    this.name=name;
    this.usn=usn;
}
String getName(){
    return this.name;
}
void setName(String name){
    this.name=name;
}

void display(){
    System.out.println("Name:"+name);
    System.out.println("USN:"+usn);
}
}
class Driver1{
    public static void main(String[] args) {
        Student s1=new Student("Ashank",123);
        s1.display();
        System.out.println(s1.getName());//usage of get to retrieve the data from private member
        s1.setName("Shiva");//writing the content of private data member
        s1.display();
    }
}

