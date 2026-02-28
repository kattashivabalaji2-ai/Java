package ExceptionHandling;

public class EX1 {
    public static void main(String[] args) {

        int i,j,k=0;
        i=20;
        j=0;
        int[] arr={1,2,3,4,5};
        try{
            //k=i/j;
            System.out.println(arr[10]);

        }catch(ArithmeticException e){
            System.out.println("Undefined");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("There is no such index in array");
        }catch(Exception e){
            System.out.println("Unknown Exception raised");
        }
        finally{
            System.out.println("Execution done");
        }

    }
    static{
        System.out.println( "Execution started");
    }
}
