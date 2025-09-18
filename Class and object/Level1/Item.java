public class Item {
    // Attributes
    private String itemCode;
    private String itemName;
    private double price;
    
    // Constructor
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    
    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("------------------------");
    }
    
    // Method to calculate total cost for given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
    
    // Method to display total cost
    public void displayTotalCost(int quantity) {
        double totalCost = calculateTotalCost(quantity);
        System.out.println("Total cost for " + quantity + " " + itemName + "(s): $" + totalCost);
        System.out.println("------------------------");
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        // Creating item objects
        Item item1 = new Item("ITM001", "Laptop", 999.99);
        Item item2 = new Item("ITM002", "Mouse", 25.50);
        
        // Displaying item details
        item1.displayItemDetails();
        item1.displayTotalCost(2);
        
        item2.displayItemDetails();
        item2.displayTotalCost(5);
    }
}