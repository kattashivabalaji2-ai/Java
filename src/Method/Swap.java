package Method;

public class Swap {
    static void swap(int[] a){
        int t=a[0];
        a[0]=a[1];
        a[1]=t;

    }
    public static void main(String[] args) {
        int a[]={20,30};
        for(int i=0;i<2;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        swap(a);
        for(int i=0;i<2;i++) {
            System.out.print(a[i]+" ");
        }

    }
}
