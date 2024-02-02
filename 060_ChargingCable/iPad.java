public class iPad {
    private String connectionType;
    public int charge;

public iPad(ChargingCable cord, int charge){
    this.charge = charge;
}
//setter
public void charging(String connectionType){
    if(connectionType.equals("Lightning")){
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
