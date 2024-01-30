public class Pen {
    public String colorOfInk;
    public String colorOfPen;
    public String capOrClickey;
    public int inkRemaining;
    public boolean capOff;
    public boolean clickedOut;

//base pen
public Pen(){
    colorOfInk = "black";
    colorOfPen = "gray";
    capOrClickey = "cap";
    inkRemaining = 100;
    capOff = true;
}

//pen with changing descriptions
public Pen(String pColorOfInk, String pColorOfPen, String pCapOrClickey, int pInkRemaining){
    colorOfInk = pColorOfInk;
    colorOfPen = pColorOfPen;
    capOrClickey = pCapOrClickey;
    inkRemaining = pInkRemaining;
}

public static void main(String[] args) {
}

public void inkRemaining(){
    System.out.println("The pen has " + inkRemaining + " percent of its ink remaining.");
}

public void capOff(){
    System.out.println("The pen has its " + capOrClickey + "off");
}

public void clickedOut(){
    System.out.println("The pen is not clicked out.");
}

public void wordsToWrite(String words){
    System.out.println("The pen writes \"" +  words + "\"");
}
}
