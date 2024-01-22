public class StaticMenu {
    public static void main(String[] args) {
        //instantiate
        StaticMenuItem item1 = new StaticMenuItem();
        StaticMenuItem item2 = new StaticMenuItem();
        StaticMenuItem item3 = new StaticMenuItem();
        //initialize
        StaticMenuItem.itemName = "basketball";
        StaticMenuItem.itemDescription = "orange and round";
        StaticMenuItem.printItem();

        StaticMenuItem.itemName = "LeBron";
        StaticMenuItem.itemDescription = "The GOAT";
        StaticMenuItem.printItem();

        StaticMenuItem.itemName = "Hat";
        StaticMenuItem.itemDescription = "goes on head";
        StaticMenuItem.printItem();
    }
}