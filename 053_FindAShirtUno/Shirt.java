public class Shirt{
    //variables
    static String color = "Blue";
    static String brand = "Nike";
    static String type = "t-shirt";
    static boolean isClean = true;

public static void main(String[] args) {}

public static void selfDescription(){
    //using my variables within object
    System.out.println("This is a " + color + " " + brand + " " + type);
}
public static void fold(){
    System.out.println("It is folded");
}
public static void cleanStatus(){
    //if statement to eval shirt cleanliness
    if(isClean){
        System.out.println("The shirt is clean.");
    }
    else{
        System.out.println("This shirt is not clean.");
    }
}
}
                           
