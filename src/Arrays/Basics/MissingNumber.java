package Arrays.Basics;
import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];m
        int sum=0;
        sum=n*(n+1)/2;
        int actsum=0;
        for(int i=0;i<arr.length;i++){
            actsum+=arr[i];
        }
        System.out.println("Missing Number is:"+(sum-actsum));
    }
}
