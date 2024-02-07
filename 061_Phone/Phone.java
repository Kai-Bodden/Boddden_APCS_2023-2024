public class Phone {
    public String brand;
    public int model;
    public String size;
    public String color; 
    public String connectionTypePhone;
    public int charge;

public Phone(){
    brand = "apple";
    model = 15;
    size = "max";
    color = "purple";
    connectionTypePhone = "USB-C";
    charge = 100;
}
public Phone(String brand, int model, String size, String color, String connectionTypePhone, int charge){
    this.brand = brand;
    this.model = model;
    this.size = size;
    this.color = color;
    this.connectionTypePhone = connectionTypePhone;
    this.charge = charge;
}
public Phone(String brand, int model, String size){
    this.brand = brand;
    this.model = model;
    this.size = size;
    color = "black";
    connectionTypePhone = "Lightning";
    charge = 100;
}

public Phone(ChargingCable cord, int charge){
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
}

