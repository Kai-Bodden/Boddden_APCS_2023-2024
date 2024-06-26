public class Food {
    private String expDate;
    private int calories;
    private double weight;
    private String name;

    public Food(String expDate, int calories, double weight, String name) {
        this.expDate = expDate;
        this.calories = calories;
        this.weight = weight;
        this.name = name;
    }

    public void buy() {
        System.out.println("You bought an " + name);
    }

    // Getter methods
    public String getExpDate() {
        return expDate;
    }

    public int getCalories() {
        return calories;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "This " + name + " expires on " + expDate + " has " + calories + " calories, and weighs " + weight + " grams";
    }
}