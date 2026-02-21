package OOPs_Basics.Constructors;

 class Student{
     String name;
     int usn;
     //traditional constructor
     Student(String name, int usn){
         this.name=name;
         this.usn=usn;
     }
     //copy constructor
     Student(Student s){
         this.name=s.name;
         this.usn=s.usn;
     }
     void display(){
         System.out.println("Name:"+name);
         System.out.println("USN:"+usn);
     }
}
class Driver1{
    public static void main(String[] args) {
        Student s1=new Student("Ashank",123);//Calls traditional constructor
        Student s2=new Student(s1);//calls copy constructor
        //Student s2=s1; this points to same memory locations.
        s1.display();
        s2.display();//(Clone or copied)
    }
}

