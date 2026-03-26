/**
 * Furniture represents furniture items sold in the store.
 * It extends HouseholdItem and includes properties specific to furniture.
 */
public class Furniture extends HouseholdItem {

    /** Type of furniture (chair, table, couch, etc.) */
    private String typeOfFurniture;

    /** Indicates if the furniture is modular */
    private boolean modular;

    /** Indicates if the furniture is sold as part of a set */
    private boolean soldInSet;

    /** Number of feet/legs the furniture has */
    private int amountOfFeet;

    /** Number of people the furniture can hold */
    private int amountOfPeopleCanHold;

    /** Length of the furniture */
    private double length;

    /** Width of the furniture */
    private double width;

    /**
     * Creates a new Furniture item
     * @param itemID Unique ID of the item
     * @param price Price of the item
     * @param quantity Quantity in inventory
     * @param weight Weight of the furniture
     * @param material Material the furniture is made of
     * @param areaOfUse Area where the furniture is used
     * @param typeOfFurniture Type of furniture
     * @param modular Whether it is modular
     * @param soldInSet Whether it is sold as a set
     * @param amountOfFeet Number of feet/legs
     * @param amountOfPeopleCanHold Number of people it can hold
     * @param length Length of the furniture
     * @param width Width of the furniture
     */
    public Furniture(int itemID, String name, double price, int quantity,
                     double weight, String material, String areaOfUse,
                     String typeOfFurniture, boolean modular, boolean soldInSet,
                     int amountOfFeet, int amountOfPeopleCanHold,
                     double length, double width) {

        super(itemID, name, price, quantity, weight, material, areaOfUse);

        this.typeOfFurniture = typeOfFurniture;
        this.modular = modular;
        this.soldInSet = soldInSet;
        this.amountOfFeet = amountOfFeet;
        this.amountOfPeopleCanHold = amountOfPeopleCanHold;
        this.length = length;
        this.width = width;
    }

    /**
     * Getter for typeOfFurtniture
     * @return type of furtniture
     */
    public String getTypeOfFurniture(){ return this.typeOfFurniture; }

    /**
     * Getter for modular
     * @return whether it is modular or not
     */
    public boolean getModular(){ return this.modular; }

    /**
     * Getter for soldInSet
     * @return whether it is sold in a set or not
     */
    public boolean getSoldInSet(){ return this.soldInSet; }

    /**
     * Getter for amountOfFeet
     * @return the number of feet on the furniture
     */
    public int getAmountOfFeet(){ return this.amountOfFeet; }

    /**
     * Getter for AmountOfPeopleCanHold
     * @return the number of people the furniture can hold
     */
    public int getAmountOfPeopleCanHold(){ return this.amountOfPeopleCanHold; }

    /**
     * Getter for length
     * @return The length of the furniture
     */
    public double getLength(){ return this.length; }

    /**
     * Getter for width
     * @return The width of the furtniture
     */
    public double getWidth(){ return this.width; }

    /**
     * Setter for typeOfFurniture
     * @param typeOfFurniture
     */
    public void setTypeOfFurniture(String typeOfFurniture){
        this.typeOfFurniture = typeOfFurniture;
    }

    /**
     * Setter for modular
     * @param modular
     */
    public void setModular(boolean modular){
        this.modular = modular;
    }

    /**
     * Setter for soldInSet
     * @param soldInSet
     */
    public void setSoldInSet(boolean soldInSet){
        this.soldInSet = soldInSet;
    }

    /**
     * Setter for amountOfFeet
     * @param amountOfFeet
     */
    public void setAmountOfFeet(int amountOfFeet){
        this.amountOfFeet = amountOfFeet;
    }

    /**
     * Setter for amountOfPeopleCanHold
     * @param amountOfPeopleCanHold
     */
    public void setAmountOfPeopleCanHold(int amountOfPeopleCanHold){
        this.amountOfPeopleCanHold = amountOfPeopleCanHold;
    }

    /**
     * Setter for length
     * @param length
     */
    public void setLength(double length){
        this.length = length;
    }

    /**
     * Setter for width
     * @param width
     */
    public void setWidth(double width){
        this.width = width;
    }

    /**
     * Creates a string representation of a furniture object with all attributes
     */
    @Override
    public String toString() {
        return String.format("ItemID: %d| Name: %s| Price: $%.2f| Quantity: %d| Weight: %.2f| Material: %s| Area Of Use: %s| Type of Furniture: %s| Is it Modular? %b| Is it sold in a set? %b| Number of feet: %d| Amount of people it can hold: %d| Length: %d| Width: %d", 
                        getItemID(), getName(), getPrice(), getQuantity(), getWeight(), getMaterial(), getAreaOfUse(), getTypeOfFurniture(), getModular(), getSoldInSet(), getAmountOfFeet(), getAmountOfPeopleCanHold(), getLength(), getWidth());
    }
}
