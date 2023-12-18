import java.util.Scanner;
public class DivisibleInRange{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide the lower limit of your range:");
        int min = scan.nextInt();
        System.out.println("Please provide the upper limit of your range:");
        int max = scan.nextInt();
        System.out.println("Now give the number you want to divide with:");
        int div = scan.nextInt();
        int howMany = 0;

        for (int count = min; count <= max; count++){
            if (count % div == 0){
                System.out.println(count);
                //if true, add to ocunt of how many numbers i have that are divisble by my divisor
                howMany++;
            }
        }
        System.out.println("There are " + howMany + " numbers divisible by " + div + " between " + min + " and " + max);
    }
}
//reminds me of a search feature, where I am searching for specific instances of something, and how many times it shows up 

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/