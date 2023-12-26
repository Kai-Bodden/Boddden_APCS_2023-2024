import java.util.Scanner;
public class ZodiacCalculatorOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //get name
        System.out.print("Enter your name: ");
        String userName = scan.nextLine();
        //get birth year
        System.out.print("Enter your birth year: ");
        int birthYear = scan.nextInt();
        //call the sign method
        zodiacSign(userName, birthYear);
    }

    //custom sign method
    public static void zodiacSign(String name, int birthYear) {
        int zodiacStartYear = 1972;
        int yearDifference = birthYear - zodiacStartYear;
        if (birthYear >= 1972 && birthYear <= 2023) {
            int zodiacIndex = yearDifference % 12;
            String zodiacSign;
            if (zodiacIndex == 0) {
                zodiacSign = "Rat";
            } else if (zodiacIndex == 1) {
                zodiacSign = "Ox";
            } else if (zodiacIndex == 2) {
                zodiacSign = "Tiger";
            } else if (zodiacIndex == 3) {
                zodiacSign = "Rabbit";
            } else if (zodiacIndex == 4) {
                zodiacSign = "Dragon";
            } else if (zodiacIndex == 5) {
                zodiacSign = "Snake";
            } else if (zodiacIndex == 6) {
                zodiacSign = "Horse";
            } else if (zodiacIndex == 7) {
                zodiacSign = "Goat";
            } else if (zodiacIndex == 8) {
                zodiacSign = "Monkey";
            } else if (zodiacIndex == 9) {
                zodiacSign = "Rooster";
            } else if (zodiacIndex == 10) {
                zodiacSign = "Dog";
            } else {
                zodiacSign = "Pig";
            }
            //user message
            System.out.println(name + " your Chinese Zodiac sign is " + zodiacSign);
        } else {
            //birth years before 1972 or after 2023
            System.out.println(" Only for birth years between 1972 to 2023.");
        }
    }
}
//using user provided info from main, it is plugged in and spit out as a message