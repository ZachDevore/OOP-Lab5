public class CleaningSupply extends HouseholdItem {

    private String[] chemicalsContained;
    private boolean toxic;
    private boolean flammable;

    public CleaningSupply(int itemID, double price, int quantity,
                          double weight, String material, String areaOfUse,
                          String[] chemicalsContained,
                          boolean toxic, boolean flammable){

        super(itemID, price, quantity, weight, material, areaOfUse);

        this.chemicalsContained = chemicalsContained;
        this.toxic = toxic;
        this.flammable = flammable;
    }

    public String[] getChemicalsContained(){ return chemicalsContained; }
    public boolean isToxic(){ return toxic; }
    public boolean isFlammable(){ return flammable; }

    public void setChemicalsContained(String[] chemicalsContained){
        this.chemicalsContained = chemicalsContained;
    }

    public void setToxic(boolean toxic){
        this.toxic = toxic;
    }

    public void setFlammable(boolean flammable){
        this.flammable = flammable;
    }
}
