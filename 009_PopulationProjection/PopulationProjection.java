public class PopulationProjection {
    public static void main(String []args) {
        int currentPop = 312032486;
        int bR = (7);
        int dR = (13);
        int iR = (45);
        int year = (365);
        //86400 sec in a day
        int yearlyBR = (86400/bR) * year;
        int yearlyDR = (86400/dR) * year;
        int yearlyIR = (86400/iR) * year;
        int yearlyPopChg = yearlyBR - yearlyDR + yearlyIR;
        int firstYear = currentPop + yearlyPopChg;
        int secondYear = firstYear + yearlyPopChg;
        int thirdYear = secondYear + yearlyPopChg;
        int fourthYear = thirdYear + yearlyPopChg;
        int fifthYear = fourthYear + yearlyPopChg;
        String printYearOne = ("Year one: ");
        String printYearTwo = ("Year two: ");
        String printYearThree = ("Year Three: ");
        String printYearFour = ("Year Four: ");
        String printYearFive = ("Year Five: ");

        System.out.println(printYearOne + firstYear);
        System.out.println(printYearTwo + secondYear);
        System.out.println(printYearThree + thirdYear);
        System.out.println(printYearFour + fourthYear);
        System.out.println(printYearFive + fifthYear);
    }
    
}
