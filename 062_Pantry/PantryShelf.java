public class PantryShelf{
    public static void main(String[] args){
        FoodItem soda = new FoodItem(150, 16, "Coke", "soda");
        FoodItem cookies = new FoodItem(40, 5, "Chips Ahoy", "Chocalate chip cookie");
        FoodItem shrimp = new FoodItem(80, 0, "Target Brand", "Shrimp");
        FoodItem celery = new FoodItem(10, 20, "Green Giant", "Celery");

        soda.itemDesc();
        cookies.itemDesc();
        shrimp.itemDesc();
        celery.itemDesc();

        soda.decreaseAmount(5);
        shrimp.decreaseAmount(5);
        cookies.decreaseAmount(10);
    }
}