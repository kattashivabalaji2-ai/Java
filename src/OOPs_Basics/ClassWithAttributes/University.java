package OOPs_Basics.ClassWithAttributes;
 public class University {
    String Dept;
    int DeptNo;
    String hod;
    int Year;
    public University(String Dept, int DeptNo, String hod, int year){
        this.Dept=Dept;
        this.DeptNo=DeptNo;
        this.hod=hod;
        Year=year;
    }
    int Bonus(int salary){
        int bonus=salary+(salary/80);
        return bonus;
    }
    void print(){
        System.out.printf("Department:%s\n",Dept);
        System.out.printf("Department Number:%d\n",DeptNo);
        System.out.printf("Head of Department :%s\n",hod);
        System.out.printf("Year of Joining:%s\n",Year);
    }
}
class Drive{
    public static void main(String[] args) {
        University cse=new University("Computer Science and Engineering",1,"Dr.Kamalakshi",2008);
        University ise=new University("Information Science and Engineering",2,"Dr.Madhavi",2013);
        int f=cse.Bonus(180000);
        cse.print();
        System.out.printf("Salary:%d\n\n",f);

        int g=ise.Bonus(90000);
        ise.print();
        System.out.printf("Salary:%d\n",g);
    }
}
