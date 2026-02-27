public class StoreItem {
    
    // Attributes
    private int itemID;
    private double price;

    // Constructor
    public StoreItem(int itemID, double price) {
        this.itemID = itemID;
        this.price = price;
    }

    // No args Consctructor
    public StoreItem() {
        this.itemID = -1;
        this.price = -1;
    }

    // Getters
    public int getItemID() {return this.itemID;}
    public double getPrice() {return this.price;}

    // Setters
    public void setItemID(int itemID) {this.itemID = itemID;}
    public void setPrice(double price) {this.price = price;}

}