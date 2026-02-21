package OOPs_Basics.ClassWithAttributes;

public class BankAccount {
    String accountHolder;
    double balance;
    BankAccount(String accountHolder, double balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    void deposit(double amount){
        balance=balance+amount;
        System.out.println("Amount deposited:"+amount);
        System.out.println("Updated Balance:"+this.balance);
    }
    void withdraw(double amount){
        if (amount<=balance)
        {
            balance=balance-amount;
            System.out.println("Amount withdrawn:"+amount);
        }
        else{
            System.out.println("INSUFFECIENT BALANCE");
        }
    }
    void displayBalance() {
        System.out.println("Account Holder:" + this.accountHolder);
        System.out.println("Current Balance:" + this.balance);
    }
}
class Dr{
    public static void main(String[] args) {
        BankAccount ac1=new BankAccount("Ram",90000.00);
        ac1.deposit(6000.00);
        ac1.withdraw(7000.00);
        ac1.displayBalance();
    }
}
