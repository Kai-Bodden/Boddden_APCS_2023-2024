public class Cereal extends Food {
    String brand;
    int boxSize;

    public Cereal(String expDate, int calories, double weight, String name, String brand, int boxSize){
        super(expDate, calories, weight, name);
        this.brand = brand;
        this.boxSize = boxSize;
    }

    public void pour(){
        if (boxSize < 5 && boxSize > 0){
            System.out.println("You have a small bowl of cereal.");
        }
        else if (boxSize >= 5) {
            System.out.println("You have a large bowl of cereal.");
        }
        else {
            System.out.println("You have no cereal.");
        }
    }

    public void addMilk(){
        System.out.println("You have added milk to the cereal :)");
    }
}
