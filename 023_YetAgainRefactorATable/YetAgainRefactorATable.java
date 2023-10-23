import java.util.Scanner;
public class YetAgainRefactorATable {
    public static void main(String[]args) { 
        Scanner scan = new Scanner(System.in);
        double c1r1 = 1.0;
        double c1r2 = 2.0;
        double c1r3 = 3.0;
        double c1r4 = 4.0;
        double c2r1 = Math.pow(c1r1, 2.0);
        double c2r2 = Math.pow(c1r2, 2.0);
        double c2r3 = Math.pow(c1r3, 2.0);
        double c2r4 = Math.pow(c1r4, 2.0);
        double c3r1 = Math.pow(c1r1, 3.0);
        double c3r2 = Math.pow(c1r2, 3.0);
        double c3r3 = Math.pow(c1r3, 3.0);
        double c3r4 = Math.pow(c1r4, 3.0);

        System.out.println("a    a^2    a^3");
        System.out.println(c1r1 + "    " + c2r1 + "      " + c3r1);
        System.out.println(c1r2 + "    " + c2r2 + "      " + c3r2);
        System.out.println(c1r3 + "    " + c2r3 + "      " + c3r3);
        System.out.println(c1r4 + "    " + c2r4 + "     " + c3r4);
        System.out.println("Enter a number for your own row: ");
        double userNum = scan.nextDouble();
        double numSqr = Math.pow(userNum, 2.0);
        double numCbed = Math.pow(userNum, 3.0);
        System.out.println("a    a^2    a^3");
        System.out.println(userNum + "    " + numSqr + "      " + numCbed);
        //learned how to use math object 
    }
}
