public class MovieTicket {
    // Attributes
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;
    
    // Constructor
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "";
        this.price = 0.0;
        this.isBooked = false;
    }
    
    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Ticket is already booked.");
        }
        System.out.println("------------------------");
    }
    
    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Ticket Details:");
        System.out.println("Movie Name: " + movieName);
        if (isBooked) {
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
            System.out.println("Status: Booked");
        } else {
            System.out.println("Status: Not Booked");
        }
        System.out.println("------------------------");
    }
    
    // Method to cancel booking
    public void cancelBooking() {
        if (isBooked) {
            this.seatNumber = "";
            this.price = 0.0;
            this.isBooked = false;
            System.out.println("Booking cancelled successfully!");
        } else {
            System.out.println("No booking found to cancel.");
        }
        System.out.println("------------------------");
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        // Creating movie ticket objects
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame");
        MovieTicket ticket2 = new MovieTicket("The Dark Knight");
        
        // Testing booking system
        ticket1.displayTicketDetails();
        ticket1.bookTicket("A12", 15.50);
        ticket1.displayTicketDetails();
        
        ticket2.displayTicketDetails();
        ticket2.bookTicket("B08", 12.00);
        ticket2.displayTicketDetails();
        ticket2.cancelBooking();
        ticket2.displayTicketDetails();
    }
}