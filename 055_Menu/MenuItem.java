public class MenuItem {
    //variables
    public String itemName;
    public String itemDescription;
    //constructor, not method :)
    public MenuItem(String itemName, String itemDescription) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }
    public void printItem() {
        System.out.println("Item: " + itemName + ", Description: " + itemDescription);
    }
}
