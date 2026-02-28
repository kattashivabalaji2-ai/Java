package ExceptionHandling;

public class IneligibleForPlacementException extends Exception{
    IneligibleForPlacementException(String msg){
        super(msg);
    }
}
class Student{
    static void backlogs(int n)throws IneligibleForPlacementException{
        if(n==0){
            throw new IneligibleForPlacementException("Eligible for placements");
        }
        System.out.println("Not eligible for placements");
    }

    public static void main(String[] args) {
        try{
            backlogs(3);
        }catch(IneligibleForPlacementException e){
            System.out.println(e.getMessage());

        }
    }
}
