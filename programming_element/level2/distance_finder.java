package level2;

import java.util.Scanner;

public class distance_finder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double yards = distanceInFeet / 3; // 1 yard = 3 feet
        double miles = yards / 1760; // 1 mile = 1760 yards

        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);

        input.close(); // Fixes resource leak
    }
}
