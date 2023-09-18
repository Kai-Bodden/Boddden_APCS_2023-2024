public class PopulationProjection {
    public static void main(String []args) {
        int currentPop = 312032486;
        int bR = (7);
        int dR = (13);
        int iR = (45);
        int year = (365);
        int day = (24);
        //86400 sec in a day
        int yearlyBR = (86400/bR) * year * day;
        int yearlyDR = (86400/dR) * year * day;
        int yearlyIR = (86400/iR) * year * day;
        int yearlyPopChg = yearlyBR - yearlyDR + yearlyIR;
        int firstYear = currentPop + yearlyPopChg;
        int secondYear = firstYear + yearlyPopChg;
        int thirdYear = secondYear + yearlyPopChg;
        int fourthYear = thirdYear + yearlyPopChg;
        int fifthYear = fourthYear + yearlyPopChg;

        System.out.println(firstYear);
        System.out.println(secondYear);
        System.out.println(yearlyPopChg);
        
        

    }
    
}
