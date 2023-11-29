import java.util.Scanner;
public class SimpleCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide and integer");
        int usernum = scan.nextInt();
        int count = 0;
        while (count < usernum)
        //while my given condition is true, the follwing code will execute
        {
            System.out.println(count);
            count++;
        }
    }
}
