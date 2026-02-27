public class ElectronicsInventory {

    private ElectronicItem[] electronicInventoryArr;
    private int arrIndex; // keeps track of the how many items are in the array

    public ElectronicsInventory() {
        electronicInventoryArr = new ElectronicItem[25]; // Defaults to 25 items
        arrIndex = 0; // starts out empty
    }

    public void appendItem(ElectronicItem item) {
        /*
        If adding an item to the array would make it out of bounds need to create a new array
        and copy the existing one to it, append the item to the end, and make the original arr point
        to the new one.
        */

      // If the array isn't big enough create a copy with size + 1
      if (arrIndex == electronicInventoryArr.length) {
        ElectronicItem[] copy = new ElectronicItem[electronicInventoryArr.length + 1];

        // Manually copy the array 
        for (int i = 0; i < electronicInventoryArr.length; i++) {
            copy[i] = electronicInventoryArr[i];
        }

        electronicInventoryArr = copy; // set the array to point to the copy
      }

      
      electronicInventoryArr[arrIndex] = item; // Add Item to the next empty index
      arrIndex++; // set the counter + 1 
    }

    // public void sellItem(int itemId) {
        
    // }

    
}
