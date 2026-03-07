package RecurssionandBacktracking.Recurssion;
//Recursive way if solving problem
public class SumofNByrecursion {
    static int Sum(int n){
        //base case
        if(n==1){
            return 1;

        }
        return n+Sum(n-1);
    }

    public static void main(String[] args) {
        int result=Sum(10);
        System.out.println(result);
    }
}
