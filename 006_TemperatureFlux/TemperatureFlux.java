public class TemperatureFlux {
    public static void main(String[]args) {
        int tempHighNum = (73);
        int tempLowNum = (51);
        //int math example
        int tempDiffNum = (tempHighNum - tempLowNum);
        //concatenations and adding variables to create a larger variable
        //strings helpful instead of printing because it is easier to add to as the variable becomes more complicated
            String tempDifference = ("The difference between the high and low temperature is " + tempDiffNum + " degrees.");
            String tempHigh = ("Today's High: " + tempHighNum + " degrees.");
            String tempLow = ("Today's Low: " + tempLowNum + " degrees.");   
                System.out.println(tempHigh);
                System.out.println(tempLow);
                System.out.println(tempDifference);
             
            

    }
    
}
