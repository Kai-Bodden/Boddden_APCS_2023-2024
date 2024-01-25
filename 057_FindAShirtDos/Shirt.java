public class Shirt {
    public String color;
    public String brand;
    public String type; 
    public boolean isClean;
    public boolean isFolded;

//constructor
public Shirt(){
    color = "red";
    brand = "nike";
    type = "t-shirt";
    isClean = true;
    isFolded = true;
}

public Shirt(String sColor, String sBrand, String sType, boolean sIsClean, boolean sIsFolded){
    color = sColor;
    brand = sBrand;
    type = sType;
    isClean = sIsClean;
    isFolded = sIsFolded;
}

public static void main(String[] args) {
}
//methods
public void selfDescription(){
    System.out.println("You have a " + color + " " + brand + " " + type);
}

public void fold(){
    if(isFolded){
        System.out.println("The " + type + " is folded.");
    }
    else{
        System.out.println("The " + type + " is not folded.");
    }
}

public void cleanStatus(){
    if(isClean){
        System.out.println("The " + type + " is clean.");
    }
    else{
        System.out.println("The " + type + " is not clean.");
    }
}
}
