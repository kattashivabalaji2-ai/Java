package ExceptionHandling;
//Multiple catch
public class EX2 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=2;
        int[] arr={1,2,3,4,5};
        try{
          k=i/j;
          System.out.println(k);
            System.out.println(arr[10]);
        }catch(ArithmeticException|ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
