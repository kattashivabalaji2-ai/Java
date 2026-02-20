package Looping;
import java.util.Scanner;
public class Butterfly {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=in.nextInt();
        //upper part
        for (int i = 1; i<=size; i++) {
            for (int j = 1; j <=i; j++)
                System.out.print(" * ");
            for(int k=2*i;k<(2*size);k++)
                System.out.print("   ");
            for (int l = 1; l <=i; l++)
                System.out.print(" * ");
            System.out.println();
        }
        //lower part
        for (int i = size; i>=0; i--) {
            for (int j = 1; j <=i; j++)
                System.out.print(" * ");
            for(int k=2*i;k<(2*size);k++)
                System.out.print("   ");
            for (int l = 1; l <=i; l++)
                System.out.print(" * ");
            System.out.println();
        }
    }
}
