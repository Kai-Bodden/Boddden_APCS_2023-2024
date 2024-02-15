public class PhoneTwo {
    public String brand;
    public int model;
    public String size;
    public String color; 
    public String connectionTypePhone;
    public int charge;
    public String userText;
    public String userMusic;
    public boolean userPower;
    public String userCall;

public PhoneTwo(){
    brand = "apple";
    model = 15;
    size = "max";
    color = "purple";
    connectionTypePhone = "USB-C";
    charge = 100;
}
public PhoneTwo(String brand, int model, String size, String color, String connectionTypePhone, int charge){
    this.brand = brand;
    this.model = model;
    this.size = size;
    this.color = color;
    this.connectionTypePhone = connectionTypePhone;
    this.charge = charge;
}
public PhoneTwo(String brand, int model, String size){
    this.brand = brand;
    this.model = model;
    this.size = size;
    color = "black";
    connectionTypePhone = "Lightning";
    charge = 100;
}
public PhoneTwo(ChargingCable cord, int charge){
    this.charge = charge;
}
//setter
public void charging(String connectionType){
    if(connectionType.equals(connectionTypePhone)){
        while ( charge<100){
            charge++;
            System.out.println(charge + "%");
        }
        System.out.println("Fully charged");
    }
    else{
        System.out.println(charge + "%");
        System.out.println("Wrong charger bud");
    }
}
public static void main(String[] args) {
}
public void phoneDesc(){
    System.out.println("You have a " + color + " " + brand + " " + model + " " + size);
}
public void text(String userText){
    this.userText = userText;
    System.out.println(userText);
}
public void music(String userMusic){
    this.userMusic = userMusic;
    System.out.println("Now playing " + userMusic);
}
public void power(boolean userPower){
    this.userPower = userPower;
    if(userPower){
        System.out.println("The phone is on");
    }
    else{
        System.out.println("The phone is off");
    }
}
public void call(String userCall){
    this.userCall = userCall;
    System.out.println("Now calling " + userCall);
}
}
