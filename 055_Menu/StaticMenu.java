public class StaticMenu {
    public static void main(String[] args) {
        //instantiate
        StaticMenuItem item1 = new StaticMenuItem();
        StaticMenuItem item2 = new StaticMenuItem();
        StaticMenuItem item3 = new StaticMenuItem();
        //initialize
        StaticMenuItem.itemName = "basketball";
        StaticMenuItem.itemDescription = "orange and round";
        StaticMenuItem.itemName = "Hat";
        StaticMenuItem.itemDescription = "goes on head";
        StaticMenuItem.itemName = "LeBron";
        StaticMenuItem.itemDescription = "The GOAT";

        StaticMenuItem.printItem();
        StaticMenuItem.printItem();    
        StaticMenuItem.printItem();
    }
}
//when updated they become permanent across the class
