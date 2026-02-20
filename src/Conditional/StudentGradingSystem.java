package Conditional;
import java.util.Scanner;
public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tot = 0, math, phy, che, bio, cs;
        float per;
        System.out.println("Enter the marks in maths,physics,chemistry,biology,computer");
        math = in.nextInt();
        phy = in.nextInt();
        che = in.nextInt();
        bio = in.nextInt();
        cs = in.nextInt();
        if (math < 0 || phy < 0 || che < 0 || bio < 0 || cs < 0 || math > 100 || che > 100 || phy > 100 || bio > 100 || cs > 100) {
            System.out.println("NO negative or marks above 100 to be entered");
        } else {
            tot = math + phy + che + bio + cs;
            per = ((float) tot / 500) * 100;
            System.out.println("Total Marks:" + tot);
            System.out.println("Percentage:" + per);
            if (per >= 75.f)
                System.out.println("Grade A");
            else if (per >= 50.f)
                System.out.println("Grade B");
            else if (per >= 30.f)
                System.out.println("Grade C");
            else
                System.out.println("Fail");
        }
    }
}
