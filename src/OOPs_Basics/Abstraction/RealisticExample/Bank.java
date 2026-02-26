package OOPs_Basics.Abstraction.RealisticExample;

abstract class Bank {
    String branch;
    Bank(String branch){
        this.branch=branch;
        System.out.println("Branch is:"+branch);

    }
    abstract void Interest();
}
class hdfc extends Bank{
    hdfc(String branch){
        super(branch);//refers to parent constructor
    }
    void Interest(){
        System.out.println("Interest is 10%");
    }
}
class driver{
    public static void main(String[] args) {
        hdfc obj=new hdfc("RR Nagar");
        obj.Interest();
    }
}