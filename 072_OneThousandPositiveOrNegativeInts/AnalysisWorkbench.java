public class AnalysisWorkbench {
    public static void main(String[] args) {
        //calling in my array and then placing it into my other constructor, to analze
        OneThousandPositiveOrNegativeInts numbers = new OneThousandPositiveOrNegativeInts();
        PostiveNegativeAnalysis analyze = new PostiveNegativeAnalysis(numbers.getOneThousandPositiveOrNegativeInts());

        System.out.println("Total Positive Numbers: " + analyze.getTotalPositive());
        System.out.println("Total Negative Numbers: " + analyze.getTotalNegative());
        System.out.println("Sum of all Postive: " + analyze.getSumPositive());
        System.out.println("SUm of all negative : " + analyze.getSumNegative());
    }
}

/*

3/3 - Compile/Content
-Pretty close, but we're missing the print out 
1/1 - Formatting
1/1 - Comments

Late - 1

*/