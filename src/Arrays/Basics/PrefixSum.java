package Arrays.Basics;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10}; int sum = 0;
        int[] parr=new int[arr.length];
        parr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            sum = arr[i]+ parr[i - 1];
            parr[i]=sum;
        }
        for(int i=0;i<arr.length;i++)
        System.out.print(parr[i]+" ");
        //-------------------Prefix Sum Over______________________________________
        int L=1;
        int R=3;int s;
        if(L==0){
            s=parr[R];
        }
        s=parr[R]-parr[L-1];//O(1)=Time Complexity
        System.out.println("SUM OF ARRAY FROM RANGE OF 1 to 3 indexes:"+s);
        }
    }
