public class WQSDevoreWesleyWilkersonSmith {
    
    /** Array of the Store Inventory */
    private StoreItem[] shoppingCart;

    /** How many Items are in the inventory */
    private int shoppingCartCount;

    /** Constructor for the Store */
    public WQSDevoreWesleyWilkersonSmith() {
        shoppingCart = new StoreItem[25]; // Initializing with 25 items
        shoppingCartCount = 0;
    }

    /**
     * Add an Item into the Shopping Cart
     * @param item
     */
    public void addItem(StoreItem item) {

        // If the Store Inventory is out of space.
        if (shoppingCart.length >= shoppingCartCount) {
            StoreItem[] copy = new StoreItem[shoppingCartCount * 2]; // Initialize an array double the size

            // Manually copy the array
            for (int i = 0; i < shoppingCartCount; i++) {
                copy[i] = shoppingCart[i];
            }

            shoppingCart = copy; // Set the StoreInventory to point to the copy
        }

        shoppingCart[shoppingCartCount] = item; // Add the item to the array
        shoppingCartCount++; // Add 1 to the count
    }






}
