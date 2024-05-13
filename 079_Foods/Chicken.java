public class Chicken extends Food {
    String cutOfChicken;
    boolean fried;

    //chicken uses food for its basic attributes and adds two new ones
    public Chicken(String expDate, int calories, double weight, String name, String cutOfChicken, boolean fried){
        super(expDate, calories, weight, name);
        this.cutOfChicken = cutOfChicken;
        this.fried = fried;
    }

    //methods
    public void fry(){
        if(fried) {
            System.out.println("Already fried.");
        }
        else{
            System.out.println("Frying...");
            for(int i = 0; i < 10; i++){
                System.out.println(".");
            }
            System.out.println("Fried.");
        }
    }

    public void bake(){
        if(fried){
            System.out.println("Can't bake fried chicken.");
        }
        else{
            System.out.println("Baking...");
            for(int i = 0; i < 15; i++){
                System.out.println(".");
            }
            System.out.println("Done baking.");
        }
    }

    public String toString(){
        return "This " + getName() + " " + cutOfChicken + " expires on " + getExpDate() + " has " + getCalories() + " calories, and weighs " + getWeight() + " grams";
    } 

}
