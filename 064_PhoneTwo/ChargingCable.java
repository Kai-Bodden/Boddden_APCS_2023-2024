public class ChargingCable{
    private String brand;
    private int length;
    private String connectionType;

public ChargingCable(String brand, int length, String connectionType){
    this.brand = brand;
    this.length = length;
    this.connectionType = connectionType;
}

public void chargerDesc(){
    System.out.println("This is a " + length + " inch " + brand + " " + connectionType);
}
//getter
public String getConnectionType(){
    return connectionType;
}

public static void main(String[] args) {
}
}
