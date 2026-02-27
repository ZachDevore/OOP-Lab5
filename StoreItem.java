public class StoreItem {
    
    // Attributes
    private int itemID;
    private double price;
    private int quantity;

    // Constructor
    public StoreItem(int itemID, double price, int quantity) {
        this.itemID = itemID;
        this.price = price;
        this.quantity = quantity;
    }

    // No args Consctructor should not be used. -1 denotes an issue
    public StoreItem() {
        this.itemID = -1;
        this.price = -1;
    }

    // Getters
    public int getItemID() {return this.itemID;}
    public double getPrice() {return this.price;}
    public int getQuantity() {return this.quantity;}


    // Setters
    public void setItemID(int itemID) {this.itemID = itemID;}
    public void setPrice(double price) {this.price = price;}
    public void setQuantity(int quantity) {this.quantity = quantity;}

}