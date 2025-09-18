public class MobilePhone {
    // Attributes
    private String brand;
    private String model;
    private double price;
    
    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    // Method to display all phone details
    public void displayPhoneDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("------------------------");
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        // Creating mobile phone objects
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 15", 999.00);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S24", 850.00);
        MobilePhone phone3 = new MobilePhone("Google", "Pixel 8", 750.00);
        
        // Displaying phone details
        phone1.displayPhoneDetails();
        phone2.displayPhoneDetails();
        phone3.displayPhoneDetails();
    }
}