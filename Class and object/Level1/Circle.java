public class Circle {
    // Attribute
    private double radius;
    
    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    
    // Method to display area and circumference
    public void displayCircleDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + String.format("%.2f", calculateArea()));
        System.out.println("Circumference: " + String.format("%.2f", calculateCircumference()));
        System.out.println("------------------------");
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        // Creating circle objects
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.5);
        
        // Displaying circle details
        circle1.displayCircleDetails();
        circle2.displayCircleDetails();
    }
}