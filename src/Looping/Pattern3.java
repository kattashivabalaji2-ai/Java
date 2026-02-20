package Looping;
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size:");
        int size=in.nextInt();
        //upper triangle
            for (int i = 0; i < size; i++) {
                for (int space = 0; space < size - i - 1; space++) {
                    System.out.print(" ");
                }
                for (int star = 0; star < (2 * i) + 1; star++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        //lower triangle
        for (int i =size-2; i>=0; i--) {
            for (int space = 0; space< size - i - 1; space++) {
                System.out.print(" ");
            }
            for (int star= 0; star < (2 * i) + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
