package Looping;
import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        int s[] = new int[6], tot = 0;
        float per=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marks in each subject");
        for (int i = 1; i<=5; i++) {
            s[i] = in.nextInt();
        }
        for (int j = 1; j <= 5; j++) {
            if (s[j] < 0 || s[j] > 100)
                System.out.println("No negative or Marks greater than 100");
            else
                tot += s[j];
            per = ((float) tot / 500) * 100;
        }
        System.out.println("Total Marks"+tot);
        System.out.println("percentage"+per);
    }
}