package ExceptionHandling;

public class EX3Bank {
    public static void main(String[] args) {
        try{
            int balance=2000;
            int withdraw=3000;
            if(withdraw>balance){
                throw new ArithmeticException("Insufficient Balance");
            }
            System.out.println("Withdraw succesfull");
        }catch(ArithmeticException e){
            System.out.println("Exception Caught:"+e.getMessage());
        }
    }
}
