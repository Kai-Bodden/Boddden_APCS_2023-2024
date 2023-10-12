public class ComputeAnExpression {
    public static void main (String [] args) {
        ReturningCalculator calc = new ReturningCalculator();
        double first = 9.5;
        double second = 4.5;
        double third = 2.5;
        double fourth = 3.0;
        double fifth = 45.5;
        double sixth = 3.5;
        double firstPart = calc.doubleMultiplier(first , second);
        double secondPart = calc.doubleMultiplier(third, fourth);
        double thirdPart = calc.doubleSubtractor(fifth, sixth);
        double firstCombine = calc.doubleSubtractor(firstPart, secondPart);
        double secondCombine = calc.divider(firstCombine, thirdPart);

        System.out.println(secondCombine);
//used the calc class on doubles


    
    }
}
    
/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/
