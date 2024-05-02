public class Food {
    private String expDate;
    private int calories;
    private double weight;
    private String name;
    
    public Food(String expDate, int calories, double weight, String name){
        this.expDate = expDate;
        this.calories = calories;
        this.weight = weight;
        this.name = name;
    }

    public int getCalories(){
        return calories;
    } 

    public void buy(){
        System.out.println("You bought a " + name);
    }
}
