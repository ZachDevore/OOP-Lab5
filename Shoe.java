/**
 * @author thomaswesley
 * Date: 3/16/2026
 * Section: 331-002
 * Purpose:
 */




public class Shoe extends ClothingItem{
    private category;
    private isSlip_resistant;
    private closure_type;

    /**
     * @param itemId
     * @param brand
     * @param color
     * @param price
     * @param quantity
     * @param size
     */
    public Shoe(int ItemID, String brand, String color, double price,
                int quantity, String size, String category, boolean isSlip_resistant,
                String closure_type){
        super(ItemID,brand,color,price,quantity,size)

        this.category = category;
        this.slip_resistant = slip_resistant;
        this.closure_type = closure_type;
    }

    //getters and setters

    public String getCategory(){return category;}

    public boolean getIsSlip_Resistant(){return isSlip_resistant;}

    public String getClosure_Type(){return closure_type;}

    public void String setCategory(){return this.category = category;}

    public void boolean setIsSlip_Resistant(){return this.slip_resistant = slip_resistant;}


    @override
    public String toString(){
        return "ItemID" + this.getItemID +
                "\nPrice" + this.getPrice() +
                "\nQuantity" + this.getQuantity() +
                "\nBrand" + this.getBrand() +
                "\nColor" + this.getColor() +
                "\nSize" + this.getSize() +
                "\nCategory" + this.getCategory() +
                "\nSlip Resistant" + this.getIsSlip_Resistant() +
                "\n Closure Type" + this.getClosure_Type()
    }
}