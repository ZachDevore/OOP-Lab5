public class Outerwear extends ClothingItem{
    private boolean isWaterproof;
    private boolean isReversible;



    /**
     * @param itemID
     * @param price
     * @param quanity
     * @param brand
     * @param size
     * @param color
     * @param isWaterproof
     * @param isReversible
     */
    public Outerwear(int itemID,int quanity, double price,
                     String brand, String size, String color,
                     boolean isReversible, boolean isWaterproof){

        super(itemID, price, quantity, brand,size, color);

        this.isReversible = isReversible;
        this.isWaterproof = isWaterproof;
    }

    /**
     *
     * @return isWaterproof
     */
    public boolean getIsWaterproof(){ return isWaterproof;}

    public boolean getIsReversible() {return isReversible;}


    @override
    public String toString(){
        return "Item Id" + this.getItemID() +
                "\nPrice" + this.getPrice() +
                "\nQuantity" + this.getQuantity() +
                "\nBrand" + this.getBrand() +
                "\nSize" + this.getSize() +
                "\nColor" + this.getColor() +
    }
}