public class MenuItem {
    //variables
    String itemName;
    String itemDescription;
    //constructor, not method :)
    public MenuItem(String itemName, String itemDescription) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }
    public void printItem() {
        System.out.println("Item: " + itemName + ", Description: " + itemDescription);
    }
}
