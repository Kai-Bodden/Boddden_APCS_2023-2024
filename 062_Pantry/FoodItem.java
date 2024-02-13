public class FoodItem{
    private int calories;
    private int amount;
    private String brand;
    private String type;

    public FoodItem(int calories, int amount, String brand, String type){
        this.calories = calories;
        this.amount = amount;
        this.brand = brand;
        this.type = type;
}

    //Accessors
    public int getCalories(){
        return calories;
    }
    public int getAmount(){
        return amount;
    }
    public String getBrand(){
        return brand;
    }
    public String getType(){
        return type;
    }

    //method
    public void itemDesc(){
        System.out.println("You have " + amount + " " + brand + " " + type);
    }
    
    //Mr. Mutator
    public void decreaseAmount(int amountToDecrease){
        System.out.println("Checking to see amount " + brand + " " + type + " left...");
        System.out.println("You have " + amount + " left");
        if(amountToDecrease <= amount){
            for(int i = 0; i < amountToDecrease; i++){
                amount --;
                System.out.println("Im eating a " + brand + " " + type);
            }
            System.out.println("There are now " + amount + " " + brand + " " + type);
        }
        else{
            System.out.println("Not enough left :(");
        }
    }
}