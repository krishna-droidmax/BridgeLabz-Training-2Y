public class CartItem {
    // Attributes
    private String itemName;
    private double price;
    private int quantity;
    
    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    
    // Method to add items to cart (increase quantity)
    public void addItem(int additionalQuantity) {
        if (additionalQuantity > 0) {
            this.quantity += additionalQuantity;
            System.out.println("Added " + additionalQuantity + " " + itemName + "(s) to cart.");
            System.out.println("Total quantity: " + this.quantity);
        } else {
            System.out.println("Please enter a valid quantity to add.");
        }
        System.out.println("------------------------");
    }
    
    // Method to remove items from cart (decrease quantity)
    public void removeItem(int removeQuantity) {
        if (removeQuantity > 0 && removeQuantity <= this.quantity) {
            this.quantity -= removeQuantity;
            System.out.println("Removed " + removeQuantity + " " + itemName + "(s) from cart.");
            System.out.println("Remaining quantity: " + this.quantity);
        } else if (removeQuantity > this.quantity) {
            System.out.println("Cannot remove " + removeQuantity + " items. Only " + this.quantity + " available.");
        } else {
            System.out.println("Please enter a valid quantity to remove.");
        }
        System.out.println("------------------------");
    }
    
    // Method to calculate total cost
    public double calculateTotalCost() {
        return price * quantity;
    }
    
    // Method to display total cost
    public void displayTotalCost() {
        double totalCost = calculateTotalCost();
        System.out.println("Cart Item Details:");
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("------------------------");
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        // Creating cart item objects
        CartItem item1 = new CartItem("Laptop", 999.99, 1);
        CartItem item2 = new CartItem("Mouse", 25.50, 2);
        
        // Testing cart operations
        item1.displayTotalCost();
        item1.addItem(1);
        item1.displayTotalCost();
        
        item2.displayTotalCost();
        item2.addItem(3);
        item2.removeItem(2);
        item2.displayTotalCost();
    }
}