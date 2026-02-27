public class ElectronicItem extends StoreItem {
    
    // Attributes
    private String brand;
    private int warrantyMonths;
    private double powerWatts;
    private boolean isRechargeable;

    // Constructor (not making a no args constructor) 
    public ElectronicItem(int itemID, double price, int quantity,
                        String brand, int warrantyMonths, double powerWatts, boolean isRechargeable) {

        super(itemID, price, quantity); // Calling the constructor from StoreItem

        this.brand = brand;
        this.warrantyMonths = warrantyMonths;
        this. powerWatts = powerWatts;
        this.isRechargeable = isRechargeable;
    }

    // Getters
    public String getBrand() {return this.brand;}
    public int getWarrentyMonths() {return this.warrantyMonths;}
    public double getPowerWatts() {return this.powerWatts;}
    public boolean getIsRechargable() {return this.isRechargeable;}

    // Setters
    public void setBrand(String brand) {this.brand = brand;}
    public void setWarrentyMonths(int warrentyMonths) {this.warrantyMonths = warrentyMonths;}
    public void setpowerWatts(double powerWatts) {this.powerWatts = powerWatts;}
    public void setIsRechargable(boolean isRechargable) {this.isRechargeable = isRechargable;}


}