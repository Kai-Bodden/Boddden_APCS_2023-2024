public class Pen {
    //creating my variables
    static String colorOfInk = "Cyan";
    static String colorOfPen = "Black";
    static String capOrClickey = "Clickey";
    static int inkRemaining = 100;
    
public static void main(String[] args) {}
//setting my objects that will later be called upon 
public static void inkRemaining(){
    System.out.println("The pen has " + inkRemaining + "% of its ink remaining.");
}
public static void capOff(){
    System.out.println("The pen does not have a cap, it is clickey. Therefore its cap is neither on or off.");
}
public static void clickedOut(){
    System.out.println("The pen is clicked out.");
}
public static void wordsToWrite(String words){
    System.out.println("The pen writes \"" +  words + "\"");
}
}

